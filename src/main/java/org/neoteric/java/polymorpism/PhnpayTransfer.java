package org.neoteric.java.polymorpism;

import java.util.*;
import java.util.function.BiPredicate;



public class PhnpayTransfer implements UPIPayment {
    public static Map<String, Double> accountBalanceMap = new HashMap<>();

    public static Map<String, ArrayList<Payment>> paymentHistory = new HashMap<>();

    static {
        accountBalanceMap.put("1234567890", 10000.00);
        accountBalanceMap.put("9876543210", 20000.00);
    }

    BiPredicate<String, Double> balanceCheck = (accNo, amt) -> {
        Double accountBalance = accountBalanceMap.get(accNo);
        if (accountBalance > amt) {
            return true;
        } else {
            return false;
        }
    };


//    BiPredicate<String, ArrayList<Payment>> dailybalanceCheck = (mobileNo, listOfPayments) -> {
//        Double amount=0.0;
//        for(int i=0;i< listOfPayments.size();i++){
//            amount=amount+listOfPayments.get(i).getAmount();
//        }
//    };


    @Override
    public Payment transfer(String frommobileNo, String toNumber, Double amount) {


        Payment p = new Payment();

        if (balanceCheck.test(frommobileNo, amount)) {
            //if(dailyCheck.test(frommobileno,amt))
            Double fromAccBalance = accountBalanceMap.get(frommobileNo);
            Double toAccBalance = accountBalanceMap.get(toNumber);

            Double fromTotalBalance = fromAccBalance - amount;
            Double toTotalBalance = toAccBalance + amount;
            accountBalanceMap.put(frommobileNo, fromTotalBalance);
            accountBalanceMap.put(toNumber, toTotalBalance);


            p.setStatus(Status.success.getLabel());
            p.setTransactionid(UUID.randomUUID().toString());
            p.setUtrid(UUID.randomUUID().toString());
            p.setAmount(p.getAmount()+amount);
            p.setDate(new Date());

            ArrayList<Payment> paymentlist=new ArrayList<>();
            paymentlist.add(p);

            paymentHistory.put(frommobileNo,paymentlist);
        }


            else{

                p.setStatus(Status.failure.getLabel());
                p.setTransactionid(UUID.randomUUID().toString());
                p.setUtrid(UUID.randomUUID().toString());
                p.setDate(new Date());

            }


            return p;
        }
    }

