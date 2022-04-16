package nisan7;

public class CokluArray2 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30}, {40, 50, 60}};
        int[][] arr2 = new int[2][3];
        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[0][2] = 30;
        arr2[1][0] = 40;
        arr2[1][1] = 50;
        arr2[1][2] = 60;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Eleman : " + arr[i][j]);
            }

        }
        double sayi=3.3424452;
        System.out.printf("%.2f",sayi);//virgulden sonraki kismin kac basamagini almak istiyorsak printf icine %.2f yaziyoruz

        int sayi1=34;
        System.out.printf("%10d %n",sayi1);//on karakter bosluk birakarak yaz

        String str="MERHABA DUNYA";
        System.out.printf("%10s ",str);
        System.out.printf("%S",str);//stringi buyuk harfle yazar

    }
}



