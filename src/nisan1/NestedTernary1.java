package nisan1;

import java.util.Scanner;

public class NestedTernary1 {
    public static void main(String[] args) {
        // Soru2 : verilen karakteri inceleyin,
        // kucuk harf ise consola �Kucuk Harf� ,
        // buyuk harfse consola �Buyuk Harf�
        // yoksa �girdiginiz karakter harf degil� yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf girin");
        char harf = scan.next().charAt(0);

        String sonuc = (harf >= 'a' && harf <= 'z') ? "kucuk harf" :
                (harf >= 'A' && harf <= 'Z') ? "buyuk harf" : "girilen karakter harf degil";

        System.out.println(sonuc);
    }
}
