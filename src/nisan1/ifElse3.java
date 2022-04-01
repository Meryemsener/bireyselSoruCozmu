package nisan1;

import java.util.Scanner;

public class ifElse3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("uzun ve kisa kenari giriniz");
        int kisaKenar=scan.nextInt();
        int uzunKenar=scan.nextInt();
        if(kisaKenar==uzunKenar){
            System.out.println("girdiginiz bilgiler kareye aittir");
        }else if(kisaKenar!=uzunKenar){
            System.out.println("girdiginiz uzunluklar dikdortgene aittir");
        }else System.out.println("hatali giris");


        //ternary
        String sonuc=((kisaKenar==uzunKenar)?"kare":(kisaKenar!=uzunKenar)?"dikdortgen":"hatali giris");
        System.out.println(sonuc);

    }
}
