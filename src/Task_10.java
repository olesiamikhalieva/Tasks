import java.lang.reflect.Array;
import java.util.Arrays;

public class Task_10 {
    /*
    Найдите победителя марафона.
Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
Ваша задача найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
(Опционально) Найдите человека, который прибежал вторым.

String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
     */

    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        int indexMax = 0;
        int indexSoundPlace = 0;
        int[]newTimes = Arrays.copyOf(times, times.length);
        Arrays.sort(newTimes);
        for (int i = 0; i<newTimes.length; i++){
            if (newTimes[newTimes.length-1]==times[i]){
                indexMax=i;
            }
            if (newTimes[newTimes.length-2]==times[i]){
                indexSoundPlace=i;
            }
        }
        System.out.println(names[indexMax]+" "+times[indexMax]);
        System.out.println(names[indexSoundPlace]+" "+times[indexSoundPlace]);
    }
}
