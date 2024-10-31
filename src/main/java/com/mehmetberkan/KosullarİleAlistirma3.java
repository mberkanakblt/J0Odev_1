package com.mehmetberkan;

import java.util.Scanner;

public class KosullarİleAlistirma3 {
    public static void main(String[] args) {
        System.out.println("Lutfen dogum yilinizi giriniz : ");
        int dogumYili = new Scanner(System.in).nextInt();
        int yas = 2024-dogumYili;
        if(yas >=18) System.out.println("Resit");
        else System.out.println("Resit Degil");
    }
}
