import java.util.Scanner;

public class Task_23 {
    /*
     Пользователь вводит задает расстояние до места назначения (N) и время, за которое нужно доехать (T).
     Вычислить скорость (км/ч), с которой нужно ехать.
     */
    public static void main(String[] args) {
        System.out.println("Enter destination, km:");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println("Enter time, h:");
        Scanner sc2 = new Scanner(System.in);
        int t = sc.nextInt();
        speed(s,t);

    }

    private static void speed(int s, int t) {
        System.out.println("Speed:"+s/t+"km/h");
    }
}
