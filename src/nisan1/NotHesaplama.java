package nisan1;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        //			Not�u harf sistemine cevirip yazdirin.
        //			50�den kucukse �D�,
        //			50 ye esit ve buyuk  ve 60 dan kucuk ise �C�,
        //			60 a esit ve buyuk  ve 80 dan kucuk ise �B�,
        //			80 ve uzerinde ise �A�


        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not=scan.nextInt();
        if(not>0 && not <100){
            if(not<50){
                System.out.println("D");
            }else if(not<60){
                System.out.println("C");
            }else if(not<80){
                System.out.println("B");
            }else System.out.println("A");
        }else System.out.println("hatali giris");


    }
}
