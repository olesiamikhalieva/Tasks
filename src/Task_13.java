import javax.swing.*;
import java.util.Scanner;

public class Task_13 {
    /*
    Напишите программу, которая будет просить ввести ваше имя, а потом выведет его на консоль.
     */
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("Your name is "+text);
    }
}
