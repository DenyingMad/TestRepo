package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double max = -1;
        double min = 1.1;

        for (int i = 0; i< 10; i++){
            double a = Math.random();
            System.out.println(a);
            if (a>max){
                max = a;
            }
            if (a<min){
                min = a;
            }
        }

        System.out.println("Max: "+ max + " Min: "+ min);

    }
}
