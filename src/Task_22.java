import java.util.Scanner;

public class Task_22 {
    /*
    Определить является ли символ введенный с клавиатуры цифрой, буквой или знаком пунктуации.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] massChar = text.toCharArray();
        for (int i = 0; i < massChar.length; i++) {
            if (Character.isLetter(massChar[i])) {
                System.out.println("Letter");
                break;
            }
            if (Character.isDigit(massChar[i])) {
                System.out.println("Digit");
                break;
            } else {
                System.out.println("Punctuation");
                break;
            }
        }
    }
}
