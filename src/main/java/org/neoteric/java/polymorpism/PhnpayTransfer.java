package org.neoteric.java.polymorpism;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiPredicate;

import static java.lang.System.exit;


public class PhnpayTransfer implements UPIPayment{
   static Map<String,Double> accountBalanceMap=new HashMap<>();
     static {
         accountBalanceMap.put("1234567890",10000.00);
         accountBalanceMap.put("9876543210",20000.00);
     }
        BiPredicate<String,Double> balanceCheck=(accNo,amt)->{
         Double accountBalance=accountBalanceMap.get(accNo);
         if(accountBalance>amt){
             return true;
         }else{
             return false;
         }
        };

    @Override
    public Payment transfer(String frommobileNo, String toNumber, Double amount) {

       // boolean check=limitcheck(frommobileNo,amount);
        boolean check1=limitcheckByNoOfPayments(frommobileNo);
        boolean mobileNoCkeck=phnnoCheck(frommobileNo);
        Payment p=new Payment();
        if(mobileNoCkeck) {
            if (balanceCheck.test(frommobileNo, amount)) {
                Double fromAccBalance = accountBalanceMap.get(frommobileNo);
                Double toAccBalance = accountBalanceMap.get(toNumber);

                //System.out.println("amout check"+p.getLimitCheckAmount());
                if (check1) {

                    Double fromTotalBalance = fromAccBalance - amount;
                    Double toTotalBalance = toAccBalance + amount;
                    accountBalanceMap.put(frommobileNo, fromTotalBalance);
                    accountBalanceMap.put(toNumber, toTotalBalance);


                    p.setStatus(Status.success.getLabel());
                    p.setTransactionid(UUID.randomUUID().toString());
                    p.setUtrid(UUID.randomUUID().toString());
                    p.setDate(new Date());
                    p.setNoofSuccesfulPayments(p.getNoofSuccesfulPayments() + 1);
                    p.setLimitCheckAmount(p.getLimitCheckAmount() + amount);
                    System.out.println(p.getLimitCheckAmount());
                } else {
                    System.out.println("limit exceeded exiting");
                    exit(0);
                }

            } else {

                p.setStatus(Status.failure.getLabel());
                p.setTransactionid(UUID.randomUUID().toString());
                p.setUtrid(UUID.randomUUID().toString());
                p.setDate(new Date());

            }

        }
        else{
            System.out.println("phnno does not exist");
            exit(0);
        }
        return p;
    }

//    @Override
//    public boolean limitcheck(String frommobileNo, Double amount) {
//        Payment p = new Payment();
//        System.out.println(p.getLimitCheckAmount());
//        if (p.getLimitCheckAmount() < 10000) {
//
//            return true;
//
//        } else {
//
//            return false;
//        }
//    }

    @Override
    public boolean limitcheckByNoOfPayments(String frommobileNo) {
        Payment p=new Payment();
        System.out.println("no.of payments"+p.getNoofSuccesfulPayments());
        if(p.getNoofSuccesfulPayments()<=3){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean phnnoCheck(String frommobileNo) {
        if(accountBalanceMap.containsKey(frommobileNo)){
            return true;
        }
        else {
            return false;
        }
    }
}
