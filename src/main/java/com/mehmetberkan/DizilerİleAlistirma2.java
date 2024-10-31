package com.mehmetberkan;

public class DizilerİleAlistirma2 {
    public static void main(String[] args) {
        int[] sayilar = {5,12,133,41,1,0,7};
        int enk = sayilar[0];

        for(int i = 0; i < sayilar.length; i++){
            if(sayilar[i]<enk){
                enk = sayilar[i];
            }
        }
        System.out.println("En kucuk sayi : " + enk);
    }
}
