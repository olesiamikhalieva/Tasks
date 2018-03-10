public class Task_11 {
    /*
    Сделайте программу, которая будет проверять является ли число типа double целым.
     */
    public static void main(String[] args) {
        double k=15.0;
        System.out.println(k);
        if ((k*10)%10==0){
            System.out.println("Целое число");
        }
        else {
            System.out.println("Число не целое");
        }
    }
}
