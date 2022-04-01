package nisan1;

import java.util.Scanner;

public class Ternary5 {
    public static void main(String[] args) {
        // Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse �Sayi pozitif� yazdirin,
        // negatifse sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        double sayi = scan.nextDouble();

        System.out.println(sayi > 0 ? "pozitif sayi" : sayi*sayi);
    }
}
