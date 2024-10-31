package com.mehmetberkan;

import java.util.Scanner;

public class KosullarileAlistima2 {
    public static void main(String[] args) {
        System.out.println("Lutfen notunuzu giriniz...");
        int not = new Scanner(System.in).nextInt();
        if(not>=50 && not<100) System.out.println("Gecti");
        else if (not<50 && not>=0) System.out.println("Kaldi");
        else System.out.println("0-100 arasi giriniz..");
    }
}
