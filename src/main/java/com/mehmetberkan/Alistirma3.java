package com.mehmetberkan;

import java.util.Scanner;

public class Alistirma3 {
    public static void main(String[] args) {
        System.out.println("Lutfen yaricapi giriniz... ");
        double yaricap = new Scanner(System.in).nextInt();
        double cevre =  2* 3.14 *yaricap; //Math.PI ile de yazılabilir.
        double alan = (3.14) * yaricap *yaricap;
        System.out.println("Alan : " + alan);
        System.out.println("Cevre : " + cevre);
    }
}
