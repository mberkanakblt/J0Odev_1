package com.mehmetberkan;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        String yakitTipi;
        String hibrit = "H";
        String lpg = "L";
        System.out.println("""
                Lutfen arabanızın yakıt türünü seçiniz...
                
                LPG: L
                HIBRIT: H
                 
                """);
            yakitTipi = new Scanner(System.in).nextLine();

            do {
                if (yakitTipi.equals(hibrit.trim()) || yakitTipi.equals(lpg.trim())){
                    System.out.println("Bilginiz alinmistir.");

                    System.out.println("Lutfen arabanin yasini giriniz");
                    int yas = new Scanner(System.in).nextInt();
                    System.out.println("Yolculugun kac KM dir");
                    int km = new Scanner(System.in).nextInt();
                    double maliyet=0.0;
                    double tutar=0.0;
                    double artanMaliyet=0.0;
                    if(yakitTipi.equals(lpg)){
                        if(yas<7){
                            maliyet = (km*0.033);
                            tutar = maliyet *1.6;
                            System.out.println("Tutariniz : " +tutar);

                            System.out.println(maliyet);
                        } else if (yas>7 && yas<=12) {
                            maliyet = (km*0.033);
                            tutar = maliyet *1.6;
                            artanMaliyet = tutar + (tutar*3/100);
                            System.out.println("Tutariniz : " +artanMaliyet);

                        }else if ( yas >12){
                            maliyet = (km*0.033);
                            tutar = maliyet *1.6;
                            artanMaliyet = tutar + (tutar*0.07);
                            System.out.println("Tutariniz : " +artanMaliyet);
                        }

                    } else if (yakitTipi.equals(hibrit)) {

                        if(yas<7){
                            maliyet = (km*0.042);
                            tutar = maliyet *1.6;
                            System.out.println("Tutariniz : " +tutar);

                            System.out.println(maliyet);
                        } else if (yas>7 && yas<=12) {
                            maliyet = (km*0.042);
                            tutar = maliyet *1.6;
                            artanMaliyet = tutar + (tutar*3/100);
                            System.out.println("Tutariniz : " +artanMaliyet);

                        }else if ( yas >12){
                            maliyet = (km*0.042);
                            tutar = maliyet *1.6;
                            artanMaliyet = tutar + (tutar*0.07);
                            System.out.println("Tutariniz : " +artanMaliyet);
                        }

                    }break;
                }
                else{ System.out.println("Lutfen yakit tipini dogru kodlayiniz!!!");break;}
            }while(yakitTipi==lpg|| yakitTipi==hibrit);



    }
}
