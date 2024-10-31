package com.mehmetberkan;

import java.util.Scanner;

public class DongulerİleAlistirma4 {
    public static void main(String[] args) {
        System.out.println("Lutfen bir sayi giriniz..");
        int sayi = new Scanner(System.in).nextInt();

        for(int i = 0; i < sayi; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
