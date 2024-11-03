package org.neoteric.java.polymorpism;

import java.util.Date;

public class Payment {
    private String transactionid;
    private Date date;
    private String utrid;
    private String Status;

    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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
