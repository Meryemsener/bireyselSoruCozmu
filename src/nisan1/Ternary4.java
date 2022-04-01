package nisan1;

import java.util.Scanner;

public class Ternary4 {
    public static void main(String[] args) {
        // Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        double sayi = scan.nextDouble();
        double mutlakdeger = sayi >= 0 ? sayi : (-1) * sayi;
        System.out.println(mutlakdeger);


    }
}
