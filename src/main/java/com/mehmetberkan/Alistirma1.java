package com.mehmetberkan;

import java.util.Scanner;

public class Alistirma1 {
    public static void main(String[] args) {
        System.out.println("Lutfen 1.sayiyi giriniz");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.println("Lutfen 2.sayiyi giriniz");
        int sayi2 = new Scanner(System.in).nextInt();

        int toplam = sayi1 + sayi2;
        int fark = sayi1 - sayi2;
        int carpim = sayi1 * sayi2;
        System.out.println("Toplam : " + toplam);
        System.out.println("Farki : " + fark);
        System.out.println("Carpim : " + carpim);
    }
}
