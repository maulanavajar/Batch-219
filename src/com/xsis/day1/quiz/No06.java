package com.xsis.day1.quiz;

import java.util.Scanner;

public class No06 {
    public static void main(String[] args) {
        double bmi, weight, height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Weight: ");
        weight = scan.nextDouble();
        System.out.println("Masukkan Height: ");
        height = scan.nextDouble();
        bmi = (weight*703)/height*height;
        System.out.println("Maka Nilai BMI adalah: "+bmi);
    }

}
