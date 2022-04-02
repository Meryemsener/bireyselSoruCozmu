package nisan2;

import java.util.Scanner;

public class LastIndexOf1 {
    public static void main(String[] args) {
        // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        //		kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //    	- Girilen kelime cumlede kullanilmamis.
        //		- Girilen kelime cumlede 1 kere kullanilmis.
        //		- Girilen kelime cumlede 1�den fazla kullanilmis.


        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine();

        System.out.println("bir kelime giriniz");
        String kelime=scan.next();

        int ilkIndex=cumle.indexOf(kelime);
        int sonIndex=cumle.lastIndexOf(kelime);

        if(ilkIndex==(-1)){
            System.out.println("kelime cumlede kullanilmamistir");
        }else if(ilkIndex==sonIndex){
            System.out.println("kelime 1 kez kullanilmistir");
        }else{
            System.out.println("kelime cumlede birden fazla kullanilsmitir");
        }


    }
}
