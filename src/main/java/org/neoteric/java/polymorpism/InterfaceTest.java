package org.neoteric.java.polymorpism;

public class InterfaceTest {
    public static void main(String[] args) {

        UPIPayment payment=new PhnpayTransfer();

        Payment pay=payment.transfer("1234567890","9876543210",9000.0);

        System.out.println("Status: "+pay.getStatus() +" trans id: "+pay.getTransactionid());

        System.out.println("from acc "+PhnpayTransfer.accountBalanceMap.get("1234567890"));

        System.out.println("to acc"+PhnpayTransfer.accountBalanceMap.get("9876543210"));

        Payment pay1=payment.transfer("1234567890","9876543210",900.0);

        System.out.println("Status: "+pay1.getStatus() +" trans id: "+pay1.getTransactionid());

        System.out.println("from acc "+PhnpayTransfer.accountBalanceMap.get("1234567890"));

        System.out.println("to acc"+PhnpayTransfer.accountBalanceMap.get("9876543210"));


    }
}
