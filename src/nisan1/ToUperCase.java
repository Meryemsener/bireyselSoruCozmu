package nisan1;

public class ToUperCase {
    public static void main(String[] args) {
        // verilen Stringin tamamini buyuk veya kucuk harfe cevirir
        String isim="meryem";
        System.out.println(""+isim.toUpperCase().charAt(0)+
                isim.toLowerCase().charAt(1)+ isim.toLowerCase().charAt(2)+
                isim.toLowerCase().charAt(3)+isim.toLowerCase().charAt(4)+
                isim.toLowerCase().charAt(5));
    }
}
