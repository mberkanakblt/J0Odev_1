package com.mehmetberkan;

import java.util.Scanner;

public class KosullarİleAlistirma5 {
    public static void main(String[] args) {
        System.out.println("""
                Lutfen Gun sayisi almak istediginiz ayi seciniz..
                1-Ocak
                2-Subat
                3-Mart
                4-Nisan
                5-Mayis
                6-Haziran
                7-Temmuz
                8-Agustos
                9-Eylul
                10-Ekim
                11-Kasim
                12-Aralik
                """);
        int ay = new Scanner(System.in).nextInt();
        String aylar;
        aylar = switch (ay){
            case 1,3,5,7,8,10,12 -> "31 gun surer";
            case 4,6,9,11 -> "30 gun surer";
            case 2 -> "28 gun surer";
            default -> "";

        };
        System.out.println(aylar);
    }
}
