package org.neoteric.java.polymorpism.abstractdemo;


public interface CorporateAccountService extends AccountService{
    Account createAcc(String gst,String pan);
}
