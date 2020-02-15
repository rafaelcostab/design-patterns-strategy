package com.rafaelcostab.service;

public class FreightSedex implements Freight{

    public double calculatePrice(int distance){
        return distance * 1.45 + 12;
    }

}
