package nisan14;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("toplama icin 1 seciniz");
        System.out.println("cikarma icin 2 seciniz");
        System.out.println("carpma icin 3 seciniz");
        System.out.println("bolme icin 4 seciniz");
        int sayi3 = scanner.nextInt();
        if(sayi3!=1 || sayi3!=2 || sayi3!=3 || sayi3!=4  ){
            System.out.println("Lutfen islem icin dogru sayiyi giriniz");
            System.out.println("Iki sayi giriniz");
            int sayi=scanner.nextInt();
            int sayi2=scanner.nextInt();

            switch( sayi3){
                case 1:
                    System.out.println(sayi+sayi2);break;
                case 2:
                    System.out.println(sayi-sayi2);break;
                case 3:
                    System.out.println(sayi*sayi2);break;
                case 4:
                    System.out.println(sayi/sayi2);break;
                    default:
                        System.out.println("hatali giris");break;
            }
        }
    }
}
