package day5_interfaces;

import java.util.Scanner;

public class Dikdortgen  implements Iislemler{

    Scanner scan = new Scanner(System.in);
    static int kisaKenar, uzunKenar,cevreSonuc,alanSonuc;

    @Override
    public void cevre() {
        System.out.println("Kisa kenar uzunlugu giriniz : ");
        kisaKenar=scan.nextInt();
        System.out.println("Uzun kenar uzunlugu giriniz : ");
        uzunKenar=scan.nextInt();

        cevreSonuc = 2*(kisaKenar+uzunKenar);
        System.out.println("Dikdortgenin cevresi :" + cevreSonuc);

    }

    @Override
    public void alan() {
        alanSonuc = kisaKenar*uzunKenar;
        System.out.println("Dikdortgenin alani :" + alanSonuc);

    }
}
