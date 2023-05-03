package day02;

import java.util.Scanner;

public class Soru1_AtmSorusu_ChatGPTile {
    //  ATM
    //    Kullanicidan giriş için kart numarasi ve şifresini isteyin,
    //    eger herhangi birini yanlis girerse tekrar isteyin.Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    //    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
    //    Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.
    //    Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
    //    Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.
    //    Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kartNo, sifre = 0;
        int bakiye = 1000;
        boolean isLoginSuccess = false;

        while (!isLoginSuccess) {
            System.out.print("Kart numaranızı girin: ");
            kartNo = scanner.nextInt();
            System.out.print("Şifrenizi girin: ");
            sifre = scanner.nextInt();

            if (kartNo == 1234 && sifre == 5678) { // Örnek kart numarası ve şifresi
                isLoginSuccess = true;
            } else {
                System.out.println("Kart numarası veya şifre yanlış. Tekrar deneyin.");
            }
        }

        System.out.println("Giriş başarılı. Yapabileceğiniz işlemler: ");
        System.out.println("1. Bakiye sorgula");
        System.out.println("2. Para yatırma");
        System.out.println("3. Para çekme");
        System.out.println("4. Para gönderme");
        System.out.println("5. Şifre değiştirme");
        System.out.println("6. Çıkış");

        int secim;
        do {
            System.out.print("İşlem seçin (1-6): ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Bakiyeniz: " + bakiye + " TL");
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz tutar: ");
                    int yatirilanTutar = scanner.nextInt();
                    bakiye += yatirilanTutar;
                    System.out.println(yatirilanTutar + " TL yatırıldı. Yeni bakiyeniz: " + bakiye + " TL");
                    break;
                case 3:
                    System.out.print("Çekmek istediğiniz tutar: ");
                    int cekilenTutar = scanner.nextInt();
                    if (cekilenTutar > bakiye) {
                        System.out.println("Yetersiz bakiye.");
                    } else {
                        bakiye -= cekilenTutar;
                        System.out.println(cekilenTutar + " TL çekildi. Yeni bakiyeniz: " + bakiye + " TL");
                    }
                    break;
                case 4:
                    System.out.print("Göndermek istediğiniz IBAN numarası: ");
                    String iban = scanner.next();
                    if (!iban.startsWith("TR") || iban.length() != 26) {
                        System.out.println("Geçersiz IBAN numarası.");
                    } else {
                        System.out.print("Göndermek istediğiniz tutar: ");
                        int gonderilenTutar = scanner.nextInt();
                        if (gonderilenTutar > bakiye) {
                            System.out.println("Yetersiz bakiye.");
                        } else {
                            bakiye -= gonderilenTutar;
                            System.out.println(gonderilenTutar + " TL gönderildi. Yeni bakiyeniz: " + bakiye + " TL");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Mevcut şifrenizi girin: ");
                    int mevcutSifre = scanner.nextInt();
                    if (mevcutSifre == sifre) {
                        System.out.print("Yeni şifrenizi girin: ");
                        int yeniSifre = scanner.nextInt();
                        sifre = yeniSifre;
                        System.out.println("Şifreniz başarıyla güncellendi.");
                    } else {
                        System.out.println("Şifre yanlış. Şifre değiştirme işlemi başarısız.");
                    }
                    break;
                case 6:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz işlem. Tekrar deneyin.");
            }

        } while (secim != 6);

        scanner.close();
    }
}
/*
Bu program, kullanıcıdan kart numarası ve şifresini isteyerek kullanıcının giriş yapmasını sağlar.
Eğer kullanıcının girdiği bilgiler doğruysa, kullanıcıya bakiye sorgulama, para yatırma,
para çekme, para gönderme, şifre değiştirme ve çıkış işlemleri arasından seçim yapma imkanı verir.
Kullanıcının seçtiği işlemi gerçekleştirdikten sonra tekrar işlem seçimi yapabilmesini sağlar.
Para çekme ve para gönderme işlemlerinde, mevcut bakiyeden daha büyük tutar çekilemeyeceğini
veya gönderilemeyeceğini kontrol eder. Para gönderme işleminde, istenen IBAN numarasının "TR"
ile başlaması ve 26 karakter uzunluğunda olması gerektiğini kontrol eder.
Şifre değiştirme işlemi sırasında, mevcut şifreyi teyit ettikten sonra kullanıcının
yeni şifresini alarak şifresini günceller.
 */
