package nisan1;

public class Concat {
    public static void main(String[] args) {
        // String olarak verilen bir degisken + ile baska bir degiskenle isleme sokulursa
        // jAVA bunlari yan yana ekler. Buna Concatenation denir.
String isim="meryem";
String isim2="aydin";
        System.out.println(isim+ " "+isim2);
        System.out.println(isim.concat(isim2));
        System.out.println(isim.concat(" ").concat(isim2));
    }
}
