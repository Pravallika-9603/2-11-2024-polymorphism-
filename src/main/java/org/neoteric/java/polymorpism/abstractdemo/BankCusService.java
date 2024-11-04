package org.neoteric.java.polymorpism.abstractdemo;

import org.neoteric.java.polymorpism.factoryDesign.AccountFactory;
import org.neoteric.java.polymorpism.factoryDesign.RetailAccServiceFactory;

public class BankCusService {

    public static void main(String[] args) {
        RetailAccServiceImp retailAccServiceImp=new RetailAccServiceImp();
        Account a=retailAccServiceImp.createAcc("1234","22222");
        System.out.println(a.getAcc());


        //Factory design pattern--abstracts the obj creation process
        AccountFactory factory=new RetailAccServiceFactory();
        RetailAccountService cusService=(RetailAccountService) factory.createAccount();
        Account account=cusService.createAcc("1234","22222");
        System.out.println(account.getAcc());

    }

}
