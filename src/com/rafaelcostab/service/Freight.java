package com.rafaelcostab.service;

public class Freight {
    private TypeFreight type;

    public Freight(TypeFreight type){
        this.type = type;
    }

    public double calculatePrice(int distance){
        double price = 0;

        if (type.equals(TypeFreight.NORMAL)){
            price = distance * 1.25 + 10;
        } else if (type.equals(TypeFreight.SEDEX)){
            price = distance * 1.45 + 12;
        }

        return price;
    }
}
