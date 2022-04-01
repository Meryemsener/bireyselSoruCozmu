package nisan1;

import java.util.Scanner;

public class ifElseTernary {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya
        // cift oldugunu yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        if(sayi%2==0){
            System.out.println("cift sayi");
        }else if(sayi%2==1){
            System.out.println("sayi tek sayidir");
        }else System.out.println("hatali giris");

        //ternary ile cozumu
        String sonuc=sayi%2==0?"cift sayi":sayi%2==1?"sayi tek":"hatali giris";
        System.out.println(sonuc);

    }
}
