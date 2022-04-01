package nisan1;

public class Switch {
    public static void main(String[] args) {
        //gun numarasina gore gun isimlerini yazdiralim
        int gunNo=4;
        switch (gunNo) {
            case 1:
                System.out.println("pazartesi");break;
            case 2:
                System.out.println("sali");break;
            case 3:
                System.out.println("carsamba");break;
            case 4:
                System.out.println("persembe");break;
            case 5:
                System.out.println("cuma");break;
            case 6:
                System.out.println("cumartesi");break;
            case 7:
                System.out.println("pazar");break;
            default:
                System.out.println("gecerli bir sayi giriniz");

        }
    }
}
