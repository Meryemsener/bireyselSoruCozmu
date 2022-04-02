package nisan2;

import java.util.Scanner;

public class Contains1 {
    public static void main(String[] args) {
        //  Soru 1) Kullanicidan email adresini girmesini isteyin,
        //         - mail @gmail.com icermiyorsa  �lutfen gmail adresi giriniz�,
        //         - @gmail.com ile bitiyorsa  �Email adresiniz kaydedildi � ,
        //         - @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("email adresini giriniz");
        String email=scan.next();

        int uzunluk=email.length();
        int index=email.lastIndexOf("@gmail.com");

        if(!email.contains("@gmail.com")){
            System.out.println("lutfen mail adresini giriniz");
        }else if(index==uzunluk-10){
            System.out.println("email adresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontrol ediniz");
        }
    }
}
