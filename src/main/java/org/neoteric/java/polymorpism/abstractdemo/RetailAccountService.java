package org.neoteric.java.polymorpism.abstractdemo;

public interface RetailAccountService extends AccountService{

    Account createAcc(String adhar,String pan);
}
