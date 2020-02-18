package com.rafaelcostab;

public class TaxCalculator {

    public void calculate(Budget budget, String typeBudget){

        if ("ICMS".equals(typeBudget.toUpperCase())){
            double icms = budget.getValue() * 0.1;
            System.out.println(icms);
        } else if ("ISS".equals(typeBudget.toUpperCase())){
            double iss = budget.getValue() * 0.1;
            System.out.println(iss);
        }
    }
}
