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

                if(satir.contains(sehir)){

                    String[] str = satir.split(" ");
                    int index=0;
                    if (str.length > 0) {
                        String plakaKodu = str[0];
                        System.out.println("Plaka Kodu: " + satir.replace("<br />","").replace(sehir,""));
                        break;
                    }
                }

        };
        }
    }
