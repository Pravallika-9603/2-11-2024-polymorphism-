package org.neoteric.java.polymorpism.abstractdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SBIAccountDBService {

    public static Map<String, Account> accountMap = new HashMap<>();

    public static Map<String, Transaction> accountTransactionMap = new HashMap<>();

    public static Map<String, ArrayList<Beneficiary>> accountBeneficiaryMap = new HashMap<>();

}
