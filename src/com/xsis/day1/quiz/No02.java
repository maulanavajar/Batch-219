package com.xsis.day1.quiz;

import java.util.Scanner;

public class No02 {
    public static void main(String[] args) {
        double nilai1, nilai2, nilai3, nilai4, rata;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nilai Mata Kuliah 1 : ");
        nilai1= scan.nextDouble();
        System.out.println("Masukkan Nilai Mata Kuliah 2 : ");
        nilai2= scan.nextDouble();
        System.out.println("Masukkan Nilai Mata Kuliah 3 : ");
        nilai3= scan.nextDouble();
        System.out.println("Masukkan Nilai Mata Kuliah 4 : ");
        nilai4= scan.nextDouble();
        rata=(nilai1+ nilai2 + nilai3 + nilai4)/4;
        System.out.println("Maka Nilai Rata-rata Adalah : "+rata);
    }
}
