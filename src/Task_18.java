import java.util.Random;

public class Task_18 {
    /*
    У вас есть двухмерный массив [n][n], придумайте способ поменять столбцы и строки местами.
     */
    // TODO: 3/10/2018 something
    //not do
    public static void main(String[] args) {
        int c = 2, s = 3;
        int[][] mASS = new int[c][s];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < s; j++) {
                mASS[i][j] = new Random().nextInt(56);
                System.out.print(mASS[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("New");
        int[][] newMass = new int[s][c];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {
                    for (int n = 0; n < s; n++) {
                        newMass[k][n] = mASS[i][j];
                        System.out.print(newMass[k][n] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}


