package com.xsis.day1.quiz;


import java.util.Scanner;

public class No03 {
    static final double pajak = .07;
    static final double tips = .10;
    public static void main(String[] args) {
        double makananBefore, makananAfter;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Harga Makanan: ");
        makananBefore = scan.nextDouble();
        makananAfter = makananBefore + (makananBefore*pajak) + (makananBefore*tips);
        System.out.println("Harga Makanan beserta Pajak dan Tips Adalah : "+makananAfter);
    }
}
