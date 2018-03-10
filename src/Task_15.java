public class Task_15 {
    /*
    Напишите метод, который будет проверять является ли число палиндромом (одинаково читающееся в обоих направлениях).
(Опционально) усовершенствуйте метод для проверки символьной строки.
     */

    public static void main(String[] args) {
        String str = "k 11111 k";
        method(str);
    }

    private static void method(String str) {
        char[] mass = str.toCharArray();
        int k = 0;
        if (mass.length % 2 == 0) {
            for (int i = 0; i < mass.length / 2; i++) {
                if (mass[i] == mass[mass.length - i - 1]) {
                    k++;
                }
            }
            if (k == mass.length / 2) {
                System.out.println("Polidrom");
            }
        }else {
        System.out.println("Not polidrom");}
    }
}
