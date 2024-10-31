package com.mehmetberkan;

import java.net.URL;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Lutfen sehrin adini giriniz");
        String sehir = new Scanner(System.in).nextLine();


            URL url = new URL("https://www.bilet.com/blog/turkiye-il-plaka-kodlari-illere-gore-plaka-listesi" );
            Scanner scannerWebSite = new Scanner(url.openStream(), "UTF-8");
            while (scannerWebSite.hasNext()) {
                String satir = scannerWebSite.nextLine();
              //  System.out.println(satir);
                if(satir.contains(sehir)){
//                    System.out.println("Plaka Kodu " + satir.replace(" Ankara<br />",""));
                    String[] parts = satir.split(" ");
                    int index=0;
                    if (parts.length > 0) {
                        String plakaKodu = parts[0];
                        System.out.println("Plaka Kodu: " + satir.replace("<br />","").replace(sehir,""));
                        break;
                    }
                }

        };
        }
    }
