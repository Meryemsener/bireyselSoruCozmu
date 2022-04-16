package nisan16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrenciListesi = new ArrayList<>();
    static ArrayList<Kisi> ogretmenListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("==================\nOGRENCI VE OGRETMEN YONETIM PANELI\n"
                + "================\n" + "1-OGRENCI ISLEMLERI\n2-OGRETMEN ISLEMLERI\nQ-CIKIS");
        System.out.println("Isleminizi seciniz : ");
        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                girisPaneli();//recursivemethod call
                break;
        }


    }

    private static void cikis() {
        System.out.println("Islem bitmistir");
    }

    public static void islemMenusu() {
        System.out.println("Sectiginiz Kisi Turu " + kisiTuru + " icin asagidaki islemlerden tercih yapiniz.\r\n "
                + " ==========ISLEMLER==========\r\n"
                + "          1-EKLEME\r\n"
                + "          2-ARAMA\r\n"
                + "          3-LISTELEME\r\n"
                + "          4-SILME\r\n"
                + "          0-ANA MENU\r\n");
        System.out.println("Islem tercihini giriniz");

        int secilenIslem = scan.nextInt();
        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();

                break;
            case 2:
                islemMenusu();


                break;

            case 3:
                islemMenusu();
                break;

            case 4:
                islemMenusu();
                break;

            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                islemMenusu();
        }


    }

    private static void ekle() {
        System.out.println(" ***  " + kisiTuru + " ekleme sayfasi *** ");
        System.out.println(" ad soyad giriniz : ");
        scan.nextLine();//dummy yani hayalet class. Bos olarak calisiyor.ayni data turlerini arka arkaya calistirmasin diye bos bir dummy atariz
        String adSoyad = scan.nextLine();
        System.out.println(" Kimlik no giriniz : ");
        String kimlikNo = scan.nextLine();
        System.out.println(" yas giriniz : ");
        int yas = scan.nextInt();
        if (kisiTuru.equals("OGRENCI")) {
            System.out.println(" Ogrenci no giriniz : ");
            String ogrenciNo = scan.next();
            System.out.println(" Sinif giriniz : ");
            String sinif = scan.next();
            Ogrenci yeniOgrenci = new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);//p'li const ogrenci obj create edildi
            ogrenciListesi.add(yeniOgrenci);//yeni ogrenciyi ekle
        } else {
            System.out.println(" Sicil no giriniz : ");
            String bolum = scan.next();
            System.out.println(" Bolum giriniz : ");
            String sicilNo = scan.next();
            Ogretmen yeniOgretmen=new Ogretmen(adSoyad, kimlikNo, yas,sicilNo,bolum);

        }


    }
}
