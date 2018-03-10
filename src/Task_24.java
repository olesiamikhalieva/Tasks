public class Task_24 {
    /*
    Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов передайте кол-во рублей и курс.
     */
    public static void main(String[] args) {
        int rub = 100;
        double corse = 0.234;
        method(rub,corse);
    }

    private static void method(int rub, double corse) {
        System.out.println("$" + corse*rub);
    }
}
