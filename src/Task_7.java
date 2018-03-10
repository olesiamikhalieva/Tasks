public class Task_7 {
    /*
    Напишите программу, которая вычислит простые числа в пределах от 2 до 100.
   (Опционально) Дополните программу так, чтобы она вычисляла составные числа.
     */
    public static void main(String[] args) {
        int k;
        int i;
        System.out.println("Primes: ");
        for (i = 2; i <= 100; i++) {
            for (k = 2; k < i; k++) {
                if (i % k == 0) {
                    break;
                }
            }
            if (k == i) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Compound numbers: ");
        for (i = 2; i <= 100; i++) {
            for (k = 2; k < i; k++) {
                if (i % k == 0) {
                    break;
                }
            }
            if (k != i) {
                System.out.print(i+" ");
            }
        }
    }
}


