package dayday;

import java.util.Scanner;

public class Anamenu {
    Scanner scan = new Scanner(System.in);

    void menu() {
        System.out.println("====================================\n" +
                "     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "    ====================================\n" +
                "     1- ÖĞRENCİ İŞLEMLERİ\n" +
                "     2- ÖĞRETMEN İŞLEMLERİ\n" +
                "     Q- ÇIKIŞ" +
                "\t SECIMINIZ: ");

        char secim = scan.next().toUpperCase().charAt(0);

        switch (secim) {
            case '1': {
            }
            case '2': {
            }
            case 'Q': {
            }
        }


    }
}
