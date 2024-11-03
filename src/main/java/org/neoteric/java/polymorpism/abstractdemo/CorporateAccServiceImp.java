package org.neoteric.java.polymorpism.abstractdemo;

import java.util.UUID;

public class CorporateAccServiceImp implements CorporateAccountService{

    @Override
    public Account createAcc(String gst, String pan) {
        Account account=new Account();
        account.setAcc(UUID.randomUUID().toString());
        account.setBalance(10000.0);
        account.setGst(gst);
        account.setPan(pan);

        SBIAccountDBService.accountMap.put(account.getAcc(), account);
        return account;
    }
}
