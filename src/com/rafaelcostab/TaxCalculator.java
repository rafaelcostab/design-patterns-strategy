package com.rafaelcostab;

public class TaxCalculator {

    public void calculate(Budget budget, Tax tax) {
        double amountTax = tax.calculate(budget);
        System.out.println(amountTax);
    }

}
