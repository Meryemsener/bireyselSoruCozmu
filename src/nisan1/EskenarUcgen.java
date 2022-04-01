package nisan1;

import java.util.Scanner;

public class EskenarUcgen {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin
        //			eger uc kenar uzunlugu birbirine esit ise ekrana �Eskenar ucgen� yazdirin.
        //			Diger durumlarda ekrana  �Eskenar degil� yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("ucgenin kenar zunluklarini giriniz");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        if(a==b && b==c){
            System.out.println("eskenar ucgen");
        }else System.out.println("eskenar ucgen degil");

    }
}
