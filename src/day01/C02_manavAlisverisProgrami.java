package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C02_manavAlisverisProgrami {

        static List<String> urunListesi = new ArrayList<>(Arrays.asList("Domates", "Salatalık", "Muz", "Soğan", "Patates"));

        static List<Integer> fiyatListesi = new ArrayList<>(Arrays.asList(20, 20, 18, 25, 15));
        static Scanner scan=new Scanner(System.in);
        static double tutar=0;
        public static void main(String[] args) {
            System.out.println("*****MÜJDE MARKET*****");

            menu();
        }

        private static void menu() {

            for (int i = 1; i <= 5; i++) {
                System.out.println(i+". ürün: "+ urunListesi.get(i-1)+" fiyatı: "+ fiyatListesi.get(i-1));
            }
            System.out.print("Seçmek istediğiniz ürünün kodunu giriniz: ");
            int urun=scan.nextInt();

            System.out.print("Miktar giriniz: ");
            double miktar= scan.nextDouble();

            tutar+=miktar*fiyatListesi.get(urun-1);

            System.out.println("Alışverişe devam etmek istiyor musunuz? E/H");
            char secim=scan.next().toUpperCase().charAt(0);

            if (secim == 'E') {
                menu();
            }else {
                System.out.println("Ödenecek tutar: "+ tutar);

            }

        }



    }
