package nisan1;

public class SwitchCase {
    public static void main(String[] args) {
        // Soru3 : verilen sayiyi inceleyin
        // Girilen sayi
        // 10  ise �Iki basamakli en kucuk sayi
        // 100 ise �uc basamakli en kucuk sayi�
        // 1000 ise �dort basamakli en kucuk sayi�
        // diger durumlarda �Girdigin sayiyi degistir� yazdirin

        int sayi=2122;
        switch(sayi){
            case 10:
                System.out.println(" Iki basamakli en kucuk sayi");
            case 100:
                System.out.println(" uc basamakli en kucuk sayi");
            case 1000:
                System.out.println(" dort basamakli en kucuk sayi");
            default:
                System.out.println("Girdigin sayiyi degistir");
        }
    }
}
