package nisan7;

public class ParametreliMethod {
    public static void toplama(int a, int b, int c){
        System.out.println("Toplamlari : "+(a+b+c));
    }
    public static void selamlama(String isim){
        System.out.println("Naber" + isim);


    }


    public static void main(String[] args) {
        selamlama("murat");
        selamlama("meryem");
        toplama(3,5,9);
        toplama(65,67,76);


    }
}
