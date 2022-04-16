package nisan14;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        /*
        kullanicidan boyunu m ve kilosunu kg alarak BMI hesaplayiniz

        kilo(kg)/(boy*boy)(cm)
        BMI<20 oldukca zayif
        20<BMI<25 normal
        25<BMI<30 sisman
        30<BMI obez


                 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg cinsinden giriniz ");
        int kilo = scan.nextInt();
        System.out.println("Lutfen boyunuzu cm cinsinden giriniz");
        int boy = scan.nextInt();

        double bmi = kilo / ((boy / 100) * (boy / 100));
        if (bmi <= 20) {
            System.out.println("oldukca zayifsiniz");
        } else if (bmi > 20 && bmi <= 25) {
            System.out.println("normal kilodasiniz");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("sismansiniz");
        } else if (bmi < 30) {
            System.out.println("obezsiniz");
        }
    }
}
