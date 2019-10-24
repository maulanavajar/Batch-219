package com.xsis.day1;

// Luas Lingkaran

/* rumus Luas Lingkaran
*  area = pi*(r*r)
*   pi = 3.14
 */

import java.util.Scanner;

public class Practice04 {
    // deklarasikan variable pi menjadi static
    // variable agar bisa diakses oleh main method
    static final double pi = 3.14;

    public static void main(String[] args) {
        double area, radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Radius : ");
        radius = scan.nextDouble();
        area = pi * (radius*radius);
        System.out.println("Luas Lingkaran : "+area);
    }
}
