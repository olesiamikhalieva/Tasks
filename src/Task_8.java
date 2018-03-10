public class Task_8 {
    /*
    Найдите среднее арифметическое массива из 10 элементов типа double.
     */
    public static void main(String[] args) {
        double [] mass = {1 ,3 ,65 ,-9 ,1.3 ,3 ,5 ,6 ,7 ,10 };
        double f = 0;
        for (int i = 0; i< mass.length-1; i++){
            f = (mass[i]+mass[i+1])/2;
        }
        System.out.println(mass.length);
        System.out.println((f+mass[9])/2);
        }
}
