public class Task_1 {
    //http://java-help.ru/java-exercises-for-beginners-1/
    /*
    Напишите программу,
    которая считывает символы пока не встретится точка.
    Также предусмотрите вывод количества пробелов.
     */
    public static void main(String[] args) {
        String str = "Java is program language. Hellj. ";
        char [] mass = str.toCharArray();
        int k=0;
        for (int i = 0; i<mass.length; i++){
        if (mass[i]=='.'){
           break;
            }
            if (mass[i]==' '){k++;}
        }
        System.out.println(str);
        System.out.println(k);
    }
}
