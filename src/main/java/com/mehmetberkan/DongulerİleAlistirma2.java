package com.mehmetberkan;

import java.util.Scanner;

public class DongulerİleAlistirma2 {
    public static void main(String[] args) {
        System.out.println("Lutfen bir sayi giriniz....");
        int sayi = new Scanner(System.in).nextInt();
        int faktoriyel = 1;
        for(int i= 1; i<=sayi; i++){
                faktoriyel *= i;
        }
        System.out.println(faktoriyel);
    }
}
