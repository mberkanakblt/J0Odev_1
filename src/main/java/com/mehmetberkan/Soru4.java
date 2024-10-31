package com.mehmetberkan;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = new int[100]; // En fazla 100 sayı alabiliriz
        int toplam = 0;
        int sayiAdedi = 0;

        while (toplam <= 100) {
            System.out.print("0-100 arasinda bir sayi giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi < 0 || sayi > 100) {
                System.out.println("Girilen sayi sinir disinnda bir sayidir.");
                continue; // Devam ettirir..
            }

            sayilar[sayiAdedi] = sayi;
            sayiAdedi++;
            toplam += sayi;

            if (toplam > 100) {
                break;
            }
        }

        if (sayiAdedi > 0) {
            int enBuyuk = sayilar[0];
            int enKucuk = sayilar[0];

            for (int i = 0; i < sayiAdedi; i++) {
                if (sayilar[i] > enBuyuk) {
                    enBuyuk = sayilar[i];
                }
                if (sayilar[i] < enKucuk) {
                    enKucuk = sayilar[i];
                }
            }

            double ortalama = (double) toplam / sayiAdedi;

            System.out.println("Girilen sayilar: ");
            for (int i = 0; i < sayiAdedi; i++) {
                System.out.print(sayilar[i] + " ");
            }
            System.out.println();
            System.out.println("En buyuk sayi: " + enBuyuk);
            System.out.println("En kucukk sayi: " + enKucuk);
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("Geçerli sayi girilmedi.");
        }




     }
    }