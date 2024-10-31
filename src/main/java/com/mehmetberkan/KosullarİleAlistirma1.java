package com.mehmetberkan;

import java.util.Scanner;

public class KosullarİleAlistirma1 {
    public static void main(String[] args) {
        System.out.println("Lutfen bir tam sayi giriniz..");
        int sayi = new Scanner(System.in).nextInt();

        if(sayi %2 ==0) System.out.println("Bu sayi cifttir...");
        else System.out.println("Bu sayi tektir...");


    }
}
