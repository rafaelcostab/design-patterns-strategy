package com.rafaelcostab;

public class TaxCalculatorTest {

    public static void main (String[] args) {
        Tax iss = new ISS();
        Tax icms = new ICMS();

        Budget budget = new Budget(500.0);

        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculate(budget, iss);
        taxCalculator.calculate(budget, icms);
    }
}
