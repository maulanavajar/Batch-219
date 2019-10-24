package com.xsis.day1.quiz;

import java.util.Scanner;

public class No01 {
    public static void main(String[] args) {
        double sudut1, sudut2, sudut3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Sudut 1 Segitiga : ");
        sudut1 = scan.nextDouble();
        System.out.println("Masukkan Sudut 2 Segitiga : ");
        sudut2 = scan.nextDouble();
        sudut3 = 180 - (sudut1+sudut2);
        System.out.println("Maka sudut 3 segitiga adalah : "+sudut3);

    }
}
