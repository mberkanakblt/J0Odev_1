package com.mehmetberkan;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        System.out.println("Lutfen ogrencilik surenizi giriniz...");
        int ogrenciYil = new Scanner(System.in).nextInt();
        if(ogrenciYil<5 && 0<=ogrenciYil) System.out.println("Elemantry School");
        else if (ogrenciYil>=5 && ogrenciYil<8) System.out.println("Junior School");
        else if (ogrenciYil>=8 && ogrenciYil<10) System.out.println("High School");
        else if(ogrenciYil>=10) System.out.println("Collage");
        else System.out.println("NONE");
    }
}
