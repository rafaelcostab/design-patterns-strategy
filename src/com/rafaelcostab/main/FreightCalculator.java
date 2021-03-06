package com.rafaelcostab.main;

import com.rafaelcostab.service.Freight;
import com.rafaelcostab.service.TypeFreight;

import java.util.Scanner;

public class FreightCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Inform the distance: ");
            int distance = sc.nextInt();

            System.out.print("Whats the type freight? (1)Normal, (2) Sedex: ");
            int optionFreight = sc.nextInt();
            TypeFreight typeFreight = TypeFreight.values()[optionFreight - 1];

            Freight freight = typeFreight.getFreight();

            double price = freight.calculatePrice(distance);
            System.out.printf("The total value is R$%.2f", price);
        }
    }
}
