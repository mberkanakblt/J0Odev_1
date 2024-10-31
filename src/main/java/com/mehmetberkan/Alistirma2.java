package com.mehmetberkan;

import java.util.Scanner;

public class Alistirma2 {
    public static void main(String[] args) {
        System.out.println("Lutfen Vize notunuzu giriniz...");
        int vize = new Scanner(System.in).nextInt();
        System.out.println("Lutfen final nootunuzu giriniz...");
        int finalNot = new Scanner(System.in).nextInt();
        int notOrt= (vize * 4/10)+ (finalNot * 6/10);
        System.out.println("Notunuz... : " + notOrt);
    }
}
