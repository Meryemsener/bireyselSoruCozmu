package nisan7;

import java.util.Scanner;

public class Methods {
    /*
       Erisim_Belirleyici(opsiyonel) Extra ozellikler Donus_Tipi, fonksiyon adi(parametreler){
               burasi method blogu
               methodun yapacagi islemler burada olacak

        }
       */

    public static void faktoryel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi : ");
        int sayi = scanner.nextInt();
        int faktoryel = 1;
        while (sayi > 0) {
            faktoryel *= sayi;
            sayi--;
        }
        System.out.println("Faktoryel : " + faktoryel);
    }


    public static void selamlama() {
        System.out.println("herkese merhaba");
        System.out.println("iyisinizdir umarim");
    }


    public static void main(String[] args) {
        //methodu cagirmak icin adini yaziyoruz
        selamlama();//fonksiyon cagrisi
        faktoryel();

    }
}
