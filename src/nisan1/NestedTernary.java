package nisan1;

public class NestedTernary {
    public static void main(String[] args) {
        // E�er �al��an kad�nsa 60 ya��ndan b�y�k oldu�unda emekli olabilir,
        // �al��an erkekse 65 ya��ndan b�y�kse emekli olabilir.

        // her seferinde scanner olusturmak yerine
        // test datalarimizi variable olarak da olusturabiliriz
        // ve kodn yazimi bittiginde bu test datalarini degistirerek
        // kodlarimizi test edebiliriz



        char cinsiyet='K';
        int yas=45;

        String sonuc=cinsiyet=='K'?(yas>=60?"emekli olabilirsin":"calismaya devam"):
                                    (yas>=65?"emekli olabilirsin":"calismaya devam");
        System.out.println(sonuc);
    }
}
