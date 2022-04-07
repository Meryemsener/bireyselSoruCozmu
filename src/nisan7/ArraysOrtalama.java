package nisan7;

import java.util.Scanner;

public class ArraysOrtalama {
    public static void mean(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];

        }
        System.out.println("ortalama : " + (double)total / arr.length);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr2 = new int[5];

        System.out.println("Array2'nin degerlerini girin  ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();

        }
        System.out.println("Array2'nin degerleri yazili ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Eleman : " + arr2[i]);
        }
        mean(arr2);//yukarida bir method olusturduk ve ortalamayi orda aldik, burda da cagirdik
    }
}

