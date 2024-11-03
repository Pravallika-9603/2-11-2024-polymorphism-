package org.neoteric.java.polymorpism.abstractdemo;

import java.util.UUID;

public class RetailAccServiceImp implements RetailAccountService{

    @Override
    public Account createAcc(String adhar, String pan) {
        Account account=new Account();
        account.setAcc(UUID.randomUUID().toString());
        account.setBalance(1000.0);
        account.setAdhar(adhar);
        account.setPan(pan);
        SBIAccountDBService.accountMap.put(account.getAcc(), account);
        return account;
    }
}
