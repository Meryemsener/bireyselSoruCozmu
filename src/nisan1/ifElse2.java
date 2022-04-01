package nisan1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("gun adi giriniz");
        String gunAdi = scanner.next();

        if(gunAdi.equalsIgnoreCase("pazar")||gunAdi.equalsIgnoreCase("cumartesi")){
            System.out.println("haftasonu");
        }else if(gunAdi.equalsIgnoreCase("pazartzsi")||gunAdi.equalsIgnoreCase("SALI")||
                gunAdi.equalsIgnoreCase("CARSAMBA")|gunAdi.equalsIgnoreCase("persembe")||
                gunAdi.equalsIgnoreCase("CUMA")) {
            System.out.println("hafta ici");
        }else System.out.println("hatali giris");
        }

    }






