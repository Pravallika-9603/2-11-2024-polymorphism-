package org.neoteric.java.polymorpism;

import java.util.Date;

public class Payment {
    private String transactionid;
    private Date date;
    private String utrid;
    private String Status;
    private static Double limitCheckAmount=0.0;
    private static int noofSuccesfulPayments=0;

    public static int getNoofSuccesfulPayments() {
        return noofSuccesfulPayments;
    }

    public static void setNoofSuccesfulPayments(int noofSuccesfulPayments) {
        Payment.noofSuccesfulPayments = noofSuccesfulPayments;
    }

    public static Double getLimitCheckAmount() {
        return limitCheckAmount;
    }

    public static void setLimitCheckAmount(Double limitCheckAmount) {
        Payment.limitCheckAmount = limitCheckAmount;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getUtrid() {
        return utrid;
    }

    public void setUtrid(String utrid) {
        this.utrid = utrid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
