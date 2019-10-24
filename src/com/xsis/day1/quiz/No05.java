package com.xsis.day1.quiz;

//celcius = (farenhait-32) * 5/9
import java.util.Scanner;

public class No05 {
    static final double konversi = 1.8;
    public static void main(String[] args) {
        double farenhait, celsius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Temperature Farenhait : ");
        farenhait= scan.nextDouble();
        celsius= (farenhait-32)/konversi;
        System.out.println("Temperature Celcius: "+celsius);
    }
}
