public class Task_3 {
    /*
    Напишите метод, который будет увеличивать заданный элемент массива на 10%.
     */
    public static void main(String[] args) {
        int numberMass = 1;
        double[] mass = {2, 10, 23, 5, -3, 6};
        method(mass, numberMass);
        for (double v : mass) {
            System.out.println(v);
        }
    }

    private static void method(double[] mass, int numberMass) {
        mass[numberMass] = 1.1 * mass[numberMass];
    }
}

