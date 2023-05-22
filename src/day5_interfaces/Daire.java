package day5_interfaces;

import java.util.Scanner;

public class Daire implements Iislemler{
    Scanner scan = new Scanner(System.in);
    static double yaricap, cevreSonuc, alanSonuc;

    @Override
    public void cevre() {
        System.out.println("Dairenin yaricapini giriniz : ");
        yaricap= scan.nextDouble();
        cevreSonuc=2*yaricap*Math.PI;
        System.out.println("Dairenin cevresi : " + cevreSonuc);

    }

    @Override
    public void alan() {
        alanSonuc=Math.PI*Math.pow(yaricap,2);
        System.out.println("Dairenin alani : " + alanSonuc);

    }
}
