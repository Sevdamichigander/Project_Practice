package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_binaryDegereCevirme {

        public static void main(String[] args) {
            // Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
            //        Örnek: 12 = 1 1 0 0

        /*
        12 yi 2 ye bolecegiz. 2 ye bolunmeyinceye kadar devam edecegiz.
        Bolum den baslayarak kalanlari yaziyoruz.
         */

            System.out.println("Lutfen bir sayi giriniz");
            Scanner scan = new Scanner(System.in);
            int sayi = scan.nextInt();

            System.out.println("Girilen ifadenin binary karsiligi : " + binaryConvert(sayi));

        }

        public static List<Integer> binaryConvert(int sayi) {

            List<Integer> binaryList = new ArrayList<>();

            while (sayi >= 1) {
                binaryList.add(sayi % 2);
                sayi /= 2; // sayi=sayi/2;

            }

            // Collections.reverse(binaryList); //ters cevirme 1. yontem
            List<Integer> tersBinaryList = new ArrayList<>();

            // ters cevirme 2. yontem

            for (int i = binaryList.size() - 1; i >= 0; i--) {// for loop 3 ten baslayacak binaryListin son indexi
                tersBinaryList.add(binaryList.get(i));

            }
            return tersBinaryList;

        }

    }

