package com.xsis.day1.quiz;

import java.util.Scanner;

public class No04 {
    public static void main(String[] args) {
        double s, u=0, a, t;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Percepatan : ");
        a= scan.nextDouble();
        System.out.println("Masukkan Waktu : ");
        t= scan.nextDouble();
        s=u+(a*t*t)*1/2;
        System.out.println("Jadi Jarak mobil adalah: "+s);
    }
}
