package nisan23;

public class MultiDimetionalForEach {
    public static void main(String[] args) {
        //muli dimetional arrayde for each
        int[][] tablo = new int[][]{
                {1, 75, 10},
                {2, 87, 13},
                {3, 95, 15},
                {4, 103, 18},
                {5, 110, 9}
        };
        int[][] tablo2 = new int[5][3];
        tablo2[0][0] = 1;
        tablo2[0][1] = 75;
        tablo2[0][2] = 10;
        //asagidaki iki kod blogu da ayni islevi gorur
        // for ve for each bloklari-
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[0].length; j++) {
                System.out.println(tablo[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------");
        for (int[] sutun : tablo) {
            for (int value : sutun) {
                System.out.println(value + " ");

            }
            System.out.println();
        }
    }

}


