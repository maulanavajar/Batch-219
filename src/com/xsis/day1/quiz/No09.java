package com.xsis.day1.quiz;

import java.util.Scanner;

public class No09 {
    static final double kwh = 15000;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kwhAwalBulan, kwhAkhirBulan, jumlahTagihan, tagihanPajak;
        System.out.println("Masukkan KwH Awal Bulan: ");
        kwhAwalBulan = scan.nextDouble();
        System.out.println("Masukkan Kwh Akhir Bulan: ");
        kwhAkhirBulan = scan.nextDouble();
        jumlahTagihan= (kwhAwalBulan-kwhAkhirBulan)*kwh;
        tagihanPajak = (jumlahTagihan*20/100) + jumlahTagihan;
        System.out.println("Jumlah Tagihan yang harus dibayar plus pajak : "+tagihanPajak);

    }
}
