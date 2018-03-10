import java.util.Arrays;

public class Task_9 {
    /*
    Напишите рекурсивный метод отображающий строку задом на перед.
     */

    public static void main(String[] args) {
       String str = "Hello java";
       method(str);
    }

    private static void method(String str) {
        char [] mass = str.toCharArray();
        if (str.length()>0){
            for (int i = 0; i<str.length(); i++){
                System.out.print(mass[mass.length-1]);
                break;
            }
            char [] newMass = Arrays.copyOf(mass,mass.length-1);
            str = String.copyValueOf(newMass);
            method(str);
       }
    }
}
