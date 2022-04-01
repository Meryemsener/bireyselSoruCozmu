package nisan1;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        //sayi tek mi cift mi
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = scan.nextInt();

        String tekCift=sayi%2==0?"cift sayi":sayi%2==1?"tek sayi":"hatali giris";
        System.out.println(tekCift);
    }
}
