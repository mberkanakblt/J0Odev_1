package com.mehmetberkan;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        System.out.println("Lutfen almak istediginiz kubik degeri giriniz..");
        int sayi = new Scanner(System.in).nextInt();

        int[] deger = new int[sayi];
        int kubik=1;

        for(int i =0; i<sayi;i++){
               kubik = (sayi-i) * (sayi-i)*(sayi-i);
            System.out.println(i+1+":"+kubik);

        }
    }
}
