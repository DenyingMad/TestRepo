package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.print("Vvedite radius ocrugnostui: ");
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);


        double a = in.nextDouble();
        double b = in.nextDouble();
        //System.out.println("Result of calculating: "+(Math.PI*r*r + Math.PI*r1*r1));
        System.out.println(a+b);
    }
}
