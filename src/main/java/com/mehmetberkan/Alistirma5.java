package com.mehmetberkan;

import java.util.Scanner;

public class Alistirma5 {
    public static void main(String[] args) {
        System.out.println("Lutfen urunun tutarini giriniz.. : ");
        int tutar = new Scanner(System.in).nextInt();
        int islem= tutar*18/100;
        int kdv = islem + tutar;
        System.out.println("KDV dahil edilmis tutariniz : "+ kdv);
    }
}
