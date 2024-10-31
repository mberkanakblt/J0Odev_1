package com.mehmetberkan;

import java.util.Scanner;

public class DongulerİleAlistirma3 {
    public static void main(String[] args) {
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = new Scanner(System.in).nextInt();
        boolean asalMi = false;
    for(int i=2;i<sayi/2;i++){
        if(sayi%i==1)
            asalMi=true;
    }
    if(asalMi) System.out.println("Bu bir asal sayidir");
    else System.out.println("Bir asal sayi degildiir");
    }
}
