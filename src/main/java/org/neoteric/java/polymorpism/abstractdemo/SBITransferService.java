package org.neoteric.java.polymorpism.abstractdemo;

import org.neoteric.java.polymorpism.Payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

public abstract class SBITransferService implements  RBIPayment{

    public static Map<String, Account> accountMap = new HashMap<>();

    public static Map<String, Transaction> accountTransactionMap = new HashMap<>();



    BiPredicate<String, Double> balanceCheck = (accNo, amt) -> {
        Double accountBalance = accountBalanceMap.get(accNo);
        if (accountBalance > amt) {
            return true;
        } else {
            return false;
        }
    };

    }
