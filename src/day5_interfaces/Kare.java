package day5_interfaces;

import java.util.Scanner;

public class Kare implements Iislemler{
    Scanner scan = new Scanner(System.in);
    static int kenar, cevreSonuc, alanSonuc;

    @Override
    public void cevre() {

        System.out.println("Karenin kenar uzunlugunu giriniz :");
        kenar = scan.nextInt();
        cevreSonuc=kenar*4;
        System.out.println("Karenin cevresi :" + cevreSonuc);

    }

    @Override
    public void alan() {
        alanSonuc=kenar*kenar;
        System.out.println("Karenin alani :" + alanSonuc);
    }
}
