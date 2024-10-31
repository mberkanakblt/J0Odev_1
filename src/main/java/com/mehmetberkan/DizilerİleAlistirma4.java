package com.mehmetberkan;

import java.util.Scanner;

public class DizilerİleAlistirma4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen kac adet dizi olusturmak istediginizi giriniz..");
        int adet = sc.nextInt();
        int[] dizi = new int[adet];
        for(int i =0;i<adet;i++){
            System.out.print(i+1+ ".ci diziyi giriniz..");
            dizi[i] = sc.nextInt();
        }
        for(int i =0;i<dizi.length;i++){
            for(int j =i+1;j< dizi.length;j++){
                if(dizi[i]==dizi[j]){
                    System.out.println("En Cok tekrar edilen : " +dizi[i]);
                }
            }
        }
    }
}
