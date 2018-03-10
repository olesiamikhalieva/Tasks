import java.util.Arrays;

public class Task_21 {
    /*
    Придумайте способ превращения числа, в массив из его разрядов.  Пример: 562 -> [5,6,2].
     */
    public static void main(String[] args) {
        int n = 562;
        int a = n / 100;
        int b = n % 100 / 10;
        int c = n % 100 % 10;
        int[] mass = {a, b, c};
        System.out.println(Arrays.toString(mass));
    }
}

