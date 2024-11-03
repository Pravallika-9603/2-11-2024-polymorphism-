package org.neoteric.java.polymorpism;

public interface UPIPayment {

    //var r bydefault public static final
    //it contains methods and vars only
    //requirement specification
    //specification in java is method
    // accesssprcifier returntype methodname(input parametters)

    int i=10;
    Payment transfer(String frommobileNo, String toNumber, Double amount);

}
