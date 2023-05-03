package day01;

import java.util.Scanner;

public class C03_sezarSifrelemeYontemi {

/*
 Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
 Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sifrelenecek metni giriniz");
        String str = scan.nextLine().toUpperCase();
        System.out.println("Kaydirma araligini giriniz");
        int kaydirma = scan.nextInt();

        sifrele(str, kaydirma);



    }

    public static void sifrele(String str, int kaydirma) {
        String sifrelenmisStr = "";
        // alfabede ki degerlere gore kaydirma yapacagiz. ASCII

        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < str.length(); i++) {
            char karakter = str.charAt(i);
            int karakterIndex=alfabe.indexOf(karakter);// karakterin kacinci indekse denk geldigini burdan ogreniyoruz
            // karakterin alfabede ki indeksini elde ettik

            // eger harften baska bir deger girilirse indexof -1 degeri dondurur.
            // Bu yuzden bunu kontrol etmeliyiz.

            if (karakterIndex>=0){
                int yeniIndex=(karakterIndex+kaydirma)%alfabe.length();// % ile z den sonra a ya dondurduk
                sifrelenmisStr+=alfabe.charAt(yeniIndex);

            }else {
                sifrelenmisStr+=str.charAt(i);
            }
        }
        System.out.println("Metnin sifrelenmis hali :" + sifrelenmisStr);
    }
}
