package nisan14;

import java.util.Scanner;

public class IfStatemnets {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindan buyuk ve 50 kilodan hafif ise kan bagisi yapamaz
        18 yasindan buuk ve 50 kilodan agir ise kan bagisi yapabilir
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas = scanner.nextInt();
        if (yas < 18) {
            System.out.println("kan bagisi yapamazsin");

        } else if (yas >= 18) {
            System.out.println("kilonuzu giriniz");
            int kilo = scanner.nextInt();

            if (kilo < 50) {
                System.out.println("kan bagisi yapamazsin");
            } else if (kilo >= 50) {
                System.out.println("kan verebilirsiniz");
            }
        } else System.out.println("hatali giris");


    }
}


