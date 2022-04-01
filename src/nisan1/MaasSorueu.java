package nisan1;

import java.util.Scanner;

public class MaasSorueu {
    public static void main(String[] args) {
        // Soru 8) Kullanicidan maas icin bir teklif isteyin
        //		ve asagidaki degerlere gore cevap azdirin.
        //		Teklif 80.000�in uzerinde ise �Kabul ediyorum� ,
        //		60 � 80.000 arasinda ise �Konusabiliriz�,
        //		60.000�nin altinda ise �Maalesef Kabul edemem� yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("maas icin istediginiz sayiyi yazin");
        int maas=scanner.nextInt();
        if(maas>80000){
            System.out.println("kabul ediyorum");
        }else if(maas>60000){
            System.out.println("konusabiliriz");
        }else System.out.println("malesef kabul edemem");

    }
}
