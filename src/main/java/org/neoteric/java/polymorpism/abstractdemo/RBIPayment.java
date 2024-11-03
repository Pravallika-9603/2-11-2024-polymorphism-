package org.neoteric.java.polymorpism.abstractdemo;

import org.neoteric.java.polymorpism.Payment;

public interface RBIPayment {
    Payment tranfer(String frommobileNo, String toNumber, Double amount);
}
