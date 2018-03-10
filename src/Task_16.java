import java.util.Scanner;

public class Task_16 {
    /*
    Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.
     */
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =1; i<11; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
