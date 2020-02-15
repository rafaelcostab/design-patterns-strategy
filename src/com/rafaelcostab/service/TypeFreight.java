package com.rafaelcostab.service;

public enum TypeFreight {
    NORMAL {
        @Override
        public Freight getFreight(){
            return new FreightNormal();
        }
    },
    SEDEX{
        @Override
        public Freight getFreight(){
            return new FreightSedex();
        }
    };

    public abstract Freight getFreight();
}
