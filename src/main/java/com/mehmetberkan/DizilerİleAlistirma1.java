package com.mehmetberkan;

import java.util.Scanner;

public class DizilerİleAlistirma1 {
    public static void main(String[] args) {
        int [] sayi = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i<5;i++){
            System.out.println(i+1+ ".ci sayiyi girinizi");
            sayi[i] = sc.nextInt();
        }
        int toplam=0;
        for(int i =0; i<5;i++){
            toplam += sayi[i];
        }
        int ortalama = toplam/5;
        System.out.println("Ortalama : "+ortalama);

    }
}
