package nisan7;

public class ReturnType {

    public static int ucIleCarp(int a) {
        return a * 3;
    }

    public static int ikiIleTopla(int a) {
        return a + 2;

    }

    public static int dortCikar(int a) {
        return a - 4;

    }


    public static int toplama(int a, int b, int c) {//burdaki void i int olarak degistiriyoruz
        System.out.println("toplama : " + (a + b + c));
        //void fonksiyonlari ekrana sadece cikti yazr deger vermezler
        //baska yerde islemler kullanilamaz sadece ekrana ciktiyi yazdirir

        return (a + b + c);


    }

    public static void main(String[] args) {
        // System.out.println("methoddan donen deger : "+ toplama(3,4,5));
        //yukaridakini kabul etmiyor, cunku void oldugu icin degeri getiremiyor.Return yazdiktan sonra

        System.out.println("methoddan donen deger : " + toplama(3, 4, 5));



        dortCikar(ikiIleTopla(ucIleCarp(4)));//icten disariya dogru islem yapar
        System.out.println("sonuc : "+dortCikar(ikiIleTopla(ucIleCarp(4))));
    }
}
