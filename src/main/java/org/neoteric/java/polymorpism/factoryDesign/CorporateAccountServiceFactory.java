package org.neoteric.java.polymorpism.factoryDesign;

import org.neoteric.java.polymorpism.abstractdemo.AccountService;
import org.neoteric.java.polymorpism.abstractdemo.CorporateAccServiceImp;

public class CorporateAccountServiceFactory implements AccountFactory{

    @Override
    public AccountService createAccount() {
        return new CorporateAccServiceImp();
    }
}
