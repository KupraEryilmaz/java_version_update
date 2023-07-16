package com.cydeo;

import java.util.Arrays;

public class CurrencyTest {

    public static void main(String[] args) {

        System.out.println("How to access a constant");
        Currency c = Currency.DIME;
        System.out.println(c);

        System.out.println("How to get all constant");
        Currency[] currencyValue = Currency.values();
        System.out.println(Arrays.toString(currencyValue));

        System.out.println("How to use switch case with enum");

        switch (Currency.NICKLE){
            case PENNY:
                System.out.println("1 cent");
                break;
            case NICKLE:
                System.out.println("5 cent");
                break;
            case DIME:
                System.out.println("10 cent");
                break;
            case QUARTER:
                System.out.println("25 cent");
                break;
        }

        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.QUARTER.getValue());

        System.out.println("How to retrieve the constant order");
        System.out.println(Currency.DIME.ordinal());


    }
}
