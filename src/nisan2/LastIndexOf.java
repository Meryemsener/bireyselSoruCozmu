package nisan2;

import java.util.Scanner;

public class LastIndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf isteyin,
        // harfin cumlede var olup olmadigini yazdirin

        Scanner sc = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=sc.nextLine();

        System.out.println("bir harf girin");
        char harf = sc.next().charAt(0);

        int index = cumle.lastIndexOf(harf);
        if(index == (-1)){
            System.out.println("harf cumlede kullanilmamis");

        }else {
            System.out.println("harf cumlede kullanilmis");
        }



    }
}
