package nisan1;

import java.util.Scanner;

public class Ternary3 {
    public static void main(String[] args) {
        // Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        String sonuc=sayi%2==0?"cift sayi":sayi%2==1?"tek sayi":"hatali giris";
        System.out.println(sonuc);



    }
}
