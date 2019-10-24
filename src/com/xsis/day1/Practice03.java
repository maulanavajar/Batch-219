package com.xsis.day1;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        // hitung persegi panjang
        Scanner scan = new Scanner(System.in);
        int panjang=0, lebar=0, luas;

        System.out.println("Panjang : ");
        panjang = scan.nextInt();
        System.out.println("Lebar : ");
        lebar = scan.nextInt();
        luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang: "+luas);
    }
}
