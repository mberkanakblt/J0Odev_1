package com.mehmetberkan;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class KosullarİleAlistirma4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz..");
        int sayi1 = sc.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz..");
        int sayi2 = sc.nextInt();
        System.out.println("Lutfen ucuncu sayiyi giriniz..");
        int sayi3 = sc.nextInt();

        int enb = sayi1;
        if(sayi2 >enb && sayi2>sayi3) enb=sayi2;
        else if (sayi3>enb && sayi3>sayi2) enb=sayi3;
        System.out.println("En buyuk sayi " + enb);
    }
}
