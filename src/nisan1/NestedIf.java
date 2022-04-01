package nisan1;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi kadin ise K, erkek ise E seklinde giriniz");
       char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if(cinsiyet=='E'){
            if(yas>65){
                System.out.println("emekli olabilirsin");
            }else System.out.println("emekli olamazsin");
        }if(cinsiyet=='K'){
           if(yas>60){
               System.out.println("emekli olabilirsin");
           }else System.out.println("calismaya devam");
        }else System.out.println("hatali giris");




    }
}
