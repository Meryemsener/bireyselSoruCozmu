package nisan1;

import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println(sayi>sayi2?sayi2:sayi);
    }
}
