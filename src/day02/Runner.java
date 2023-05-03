package day02;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geometrik şekil seçiniz: \n" +
                "1. Dikdörtgen\n" +
                "2. Daire");
        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                Dikdortgen dikdortgen1 = new Dikdortgen();//Dikdortgen class indan dikdortgen1 adinda bir obje olusturduk.
                dikdortgen1.cevre();
                dikdortgen1.alan();
                break;
            }
            case 2: {
                Daire daire1 = new Daire();
                daire1.cevre();
                daire1.alan();
                break;
            }
        }
    }
}

