package org.neoteric.java.polymorpism.factoryDesign;

import org.neoteric.java.polymorpism.abstractdemo.AccountService;

public interface AccountFactory {

    AccountService createAccount();
}
