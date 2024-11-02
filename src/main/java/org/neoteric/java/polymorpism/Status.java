package org.neoteric.java.polymorpism;

public enum Status {

    success("transaction success"),
    failure("transaction failure"),
    failurebylimit("limit"),
    pending("transaction pending");

    private String label;

     Status(String label){
        this.label=label;
    }

    public String getLabel(){
         return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
