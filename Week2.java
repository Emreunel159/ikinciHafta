/**
 * ders
 */
import java.util.Random;
import java.util.Scanner;
public class Week2 {

    public static void main(String[] args) {
        try (// Constant (sabit değer) Final ile tanımlanır.
            Scanner scanner = new Scanner(System.in)) {
            /*
            String h;
            int yas;
            System.out.println("Bir isim Giriniz");
            h = scanner.nextLine();
            System.out.println("Yaşınızı Giriniz");
            yas = scanner.nextInt();
            System.out.println("Hoşgeldiniz: " + h);
            if (yas >= 18) {
                System.out.println(h + " Bey Ehliyet alabilirsiniz.");
            } else {
                System.out.println(h + " Bey Ehliyet almaya yaşınız yetmiyor, alamazsınız.");
            }
            // SORU1: puan sorusu >70 ise tebrikler >50 ise geçer iyi <50 kaldı çalış gel
            int puan;
            System.out.println("Puanınızı Giriniz: ");
            puan = scanner.nextInt();
            if (puan > 70) {
                System.out.println("Tebrikler.İyi çalışmışsınız.");
            } else if (puan < 70 && puan > 50) {
                System.out.println("Geçer. Daha çok çalışmalısın.");
            } else if (puan < 50) {
                System.out.println("Kötü. Kaldın. Çalış gel.");
            }
            // SORU2: switxh case ile haftanın günleri
            int gun;
            System.out.println("1-7 Arası sayı giriniz: ");
            gun = scanner.nextInt();
            switch (gun) {
                case 1:
                    System.out.println("Pazartesi");
                    break;
                case 2:
                    System.out.println("Salı");
                    break;
                case 3:
                    System.out.println("Çarşamba");
                    break;
                case 4:
                    System.out.println("Perşembe");
                    break;
                case 5:
                    System.out.println("Cuma");
                    break;
                case 6:
                    System.out.println("Cumartesi");
                    break;
                case 7:
                    System.out.println("Pazar");
                    break;
                default:
                    System.out.println("1-7 arasında sayı giriniz.");
                    break;
            }
            // SORU3: Bir sayı bulma oyununda kullanıcının 3 hakkı vardır. Sayılar 0-100
            arasındadır. Sayı rastgele de üretilebilir sabit de olabilir.
            kullanıcının hakları bitmeden sayı bulunursa tebrikler mesajı verilir. Her
            denemede kullanıcının kalan hakkı yazdırılır. */
            Random rnd = new Random();
            int sayi = rnd.nextInt(100);
            int girilensayi;
            int hak = 3;
            System.out.println(sayi);
            while (hak >= 1) {
                System.out.println("Bir Sayı Giriniz: ");
                girilensayi = scanner.nextInt();
                if (girilensayi == sayi && hak != 0) {
                    System.out.println("Tebrikler Kazandınız sayı: " + sayi);
                    break;
                } else if (girilensayi != sayi) {
                    hak--;
                    System.out.println("Kalan Hakkınız: " + hak);
                    if (hak == 0) {
                        System.out.println("Hakkınız kalmadı sayı: " + sayi);
                        break;
                    }
                }
            }
        }
        
    }
}