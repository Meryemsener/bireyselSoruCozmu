package nisan1;

import java.util.Scanner;

public class KarakterBulma {
    public static void main(String[] args) {
        // Soru 2) Kullanicidan bir karakter girmesini isteyin ve
        //         girilen karakterin harf olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char ch = scan.next().charAt(0);
        if(ch>='A' ||ch>'a'&&ch<='Z' ||ch<='z'){
            System.out.println("girdiginiz karakter harftir");
        }else System.out.println("hatali giris");
    }
}
