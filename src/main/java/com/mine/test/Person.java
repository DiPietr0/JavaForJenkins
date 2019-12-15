package com.mine.test;

public class Person {
    public String pnr;

    public Person(){

    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public boolean validPnr(){
        if(pnr.length() == 12){
            return true;
        }else{
            return false;
        }
    }
}
