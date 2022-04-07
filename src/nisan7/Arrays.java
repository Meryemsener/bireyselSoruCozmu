package nisan7;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] arr1=new int []{10,20,30,40,50};
        int [] arr2=new int[5];

        System.out.println("Array2'nin degerlerini girin  ");
        for (int i=0; i<arr2.length; i++){
            arr2[i]= scan.nextInt();

        }
        System.out.println("Array2'nin degerleri yazili ");
        for(int i=0; i<arr2.length; i++){
            System.out.println("Eleman : "+arr2[i]);
        }

    }

}
