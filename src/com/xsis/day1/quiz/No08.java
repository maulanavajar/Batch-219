package com.xsis.day1.quiz;

import java.util.Scanner;

public class No08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double jumlahBelanja, discount, hemat;
        System.out.println("Masukkan Jumlah Belanja : ");
        jumlahBelanja= scan.nextDouble();
        System.out.println("Masukkan Jumlah Discount: ");
        discount= scan.nextDouble();
        hemat=jumlahBelanja*discount/100;
        System.out.println("Uang yang dihemat adalah : "+hemat);
    }
}
