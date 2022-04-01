package nisan1;

import java.util.Scanner;

public class Emeklilik {
    public static void main(String[] args) {
        //Kullaniciya yasini sorun,
        //         	eger yas 65�den kucuk ise �emekli olamazsin, calismalisin�,
        //			65�e esit veya buyukse �Emekli olabilirsin� yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("yasinizi girin");
        int yas=scan.nextInt();
        if(yas >0 && yas<65){
            System.out.println("emekli olmazsin");
        }else System.out.println("emekli olabilirsin");
    }
}
