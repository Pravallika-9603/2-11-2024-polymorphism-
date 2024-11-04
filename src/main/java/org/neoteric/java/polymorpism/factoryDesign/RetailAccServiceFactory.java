package org.neoteric.java.polymorpism.factoryDesign;

import org.neoteric.java.polymorpism.abstractdemo.AccountService;
import org.neoteric.java.polymorpism.abstractdemo.RetailAccServiceImp;

public class RetailAccServiceFactory implements AccountFactory{

    @Override
    public AccountService createAccount() {
        return new RetailAccServiceImp();
    }
}
