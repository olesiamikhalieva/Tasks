import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task_17 {
    /*
     У вас есть двухмерный массив наполненный случайными числами,
     в той же последовательности перенесите эти числа в одномерный массив.
     */
    public static void main(String[] args) {
        int[][] mASS = new int[2][3];
        System.out.println("mass length " + mASS.length);

        for (int i = 0; i < mASS.length; i++) {
            for (int j = 0; j < mASS[i].length; j++) {
                mASS[i][j] = new Random().nextInt(56);
                System.out.print(mASS[i][j] + " ");
            }
            System.out.println();
        }
        int[] masNew = new int[0];
        for (int i = 0; i < mASS.length; i++) {
            for (int j = 0; j < mASS[i].length; j++) {
                masNew = Arrays.copyOf(masNew, masNew.length + 1);
                for (int k = 0; k < masNew.length; k++) {
                    if (masNew[k] == 0) {
                        masNew[k] = mASS[i][j];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(masNew));
    }
}

