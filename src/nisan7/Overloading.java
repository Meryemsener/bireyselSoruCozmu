package nisan7;

public class Overloading {
    /*
    Bir methodun birden fazla parametre ile degisik sekillerde calismasi
    ve asiri yuklenmesi olarak tanimlanabilir
     */
//sadece parametreleri farkli olan methodlar olusturup kullaniyoruz
    public static void skorHesaplama(String name, int score) {
        System.out.println(name +" isimli oyuncu puani "+ score);
    }

    public static void toplama(int a, int b, int c) {
        System.out.println("Toplamlari : " + (a + b + c));
    }

    public static void toplama(int a, int b) {
        System.out.println("Toplamlari : " + (a + b ));
    }
    public static void toplama(int a, int b,int c ,int d) {
        System.out.println("Toplamlari : " + (a + b ));
    }

    public static void main(String[] args) {
        toplama(3, 4, 5);
        toplama(10, 44);
        toplama(10, 44,34,54);

        skorHesaplama("Meryem",3200);
//kac parametre tanimlanmissa o kadar yazilabilir
    }
}
