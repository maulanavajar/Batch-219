package com.xsis.day1;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        double literPerKilo, totalJarakTempuh, totalLiter;
        Scanner scan = new Scanner(System.in);
        System.out.println("Total Jarak ditempuh : ");
        totalJarakTempuh = scan.nextDouble();
        System.out.println("Total Bensin yang dipakai : ");
        totalLiter = scan.nextDouble();
        //calculate satu liter per Kilo nya
        literPerKilo = totalJarakTempuh / totalLiter;
        System.out.println("Satu liter per kilo: "+literPerKilo);
    }
}
