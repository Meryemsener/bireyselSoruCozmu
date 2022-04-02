package nisan1;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {


        // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        //		kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //    	- Girilen kelime cumlede kullanilmamis.
        //		- Girilen kelime cumlede 1 kere kullanilmis.
        //		- Girilen kelime cumlede 1�den fazla kullanilmis.


        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = scan.nextLine();

        System.out.println("kontrol etmek istediginiz kelimeyi girin");
        String kelime = scan.next();

        int kelimeSayisi = cumle.indexOf(kelime);

        if (kelimeSayisi < 0) {
            System.out.println("kelime cumlede kullanilmamistir");
        } else if (cumle.indexOf(kelime, kelimeSayisi + 1) == (-1)) {
            System.out.println("kelime 1 kere kullanilmistir");
        } else {
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmistir");
        }

    }
}