package com.rafaelcostab.service;

public class FreightNormal implements Freight {

    public double calculatePrice(int distance){
        return distance * 1.25 + 10;
    }

}
