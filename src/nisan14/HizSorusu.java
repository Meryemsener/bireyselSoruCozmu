package nisan14;

import java.util.Scanner;

public class HizSorusu {
    public static void main(String[] args) {
        /*
        Kullanicidan hizi isteyin. Trafik cezaisnin degerini hesaplayin
        54 hiz siniridir
        Hiz 55-74 =ceza 100 dolar
        Hiz 75-84 =ceza 150 dolar
        Hiz 85-95 =ceza 320 dolar
        Hiz 95'ten fazla ise =ceza 500 dolar
        ve surucunun ehliyeti yoksa +200 dolar ceza

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("hizinizi giriniz");
        int hiz = scan.nextInt();
        System.out.println("ehliyetiniz varsa Y yoksa N yazin");
        char ehliyet = scan.next().charAt(0);

        if (hiz < 54 && ehliyet == 'Y') {

            System.out.println("hiz kuralina uydugunuz icin tesekkurler");
        } else if (hiz >= 55 && hiz <= 74 && ehliyet == 'Y') {
            System.out.println("cezaniz 100 dolardir");
            if (hiz >= 55 && hiz <= 74 && ehliyet == 'N') {
                System.out.println("cezaniz 100 + 200 dolardir");
            }
        } else if (hiz >= 75 && hiz <= 84 && ehliyet == 'Y') {
            System.out.println("cezaniz 150 dolardir");
            if (hiz >= 75 && hiz <= 84 && ehliyet == 'N') {
                System.out.println("cezaniz 150 + 200 dolardir");
            }
        } else if (hiz >= 85 && hiz <= 94 && ehliyet == 'Y') {
            System.out.println("cezaniz 320 dolardir");
            if (hiz >= 85 && hiz <= 94 && ehliyet == 'N') {
                System.out.println("cezaniz 320 dolar + 200 dolardir");

            }


        } else if (hiz >= 95 && ehliyet == 'Y') {
            System.out.println("cezaniz 320 dolardir");
            if (hiz >= 95 && ehliyet == 'N') {
                System.out.println("cezaniz 320 dolar + 200 dolardir");
            }
        } else System.out.println("hatali giris");
    }
}