package nisan13;

import java.util.Arrays;
import java.util.Scanner;

public class interview1 {
    public static void main(String[] args) {
        /*
        kullanicidan bir string aliniz. String'de var olan her karakterin sayisini
        ekrana yazdiriniz.
        Ornek: abaa ==>a=3,  c=1

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str = scan.nextLine();

        //split
        String[] arr = str.split("");//her bir karakteri ayiralim
        System.out.println(Arrays.toString(arr));

        //siralama, sort();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //ayni karakterleri saymasi icin bir sayac
        int counter=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i-1].equals(arr[i])){
               counter++;
            }else{
                System.out.println(arr[i-1]+ " sayisi "+counter);
            }
        }




    }
}
