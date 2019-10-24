package com.xsis.day1.quiz;

import java.util.Scanner;

public class No07 {
    static final double pajak = .2;
    public static void main(String[] args) {
        double barang1, barang2, barang3, totalBarang, totalAfterPajak, ratarataTotal, ratarataPajak;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Harga barang 1 : ");
        barang1= scan.nextDouble();
        System.out.println("Masukkan Harga barang 2 : ");
        barang2= scan.nextDouble();
        System.out.println("Masukkan Harga barang 3 : ");
        barang3= scan.nextDouble();
        totalBarang=barang1+barang2+barang3;
        System.out.println("Total Barang Sebelum Pajak : "+totalBarang);
        totalAfterPajak= totalBarang+(barang1*pajak)+(barang2*pajak)+(barang3*pajak);
        System.out.println("Total Barang Setelah Terkena Pajak : "+totalAfterPajak);
        ratarataTotal=totalBarang/3;
        ratarataPajak=totalAfterPajak/3;
        System.out.println("Rata rata Tiap Produk Sebelum Kena Pajak : "+ratarataTotal);
        System.out.println("Rata rata Tiap Produk Setelah Kena Pajak : "+ratarataPajak);


    }
}
