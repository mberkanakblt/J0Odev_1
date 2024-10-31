package com.mehmetberkan;

import java.util.Scanner;

public class Alistirma4 {
    public static void main(String[] args) {
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = new Scanner(System.in).nextLine();
        int sayac = 0;
        for(int i= 0; i<cumle.length(); i++){
           cumle.charAt(i);
           sayac++;
        }
        System.out.println("Karakter Sayisi : " + sayac);
    }
}
