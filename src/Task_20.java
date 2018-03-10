public class Task_20 {
    /*
    Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.
     */
    public static void main(String[] args) {
        double nDays = 5.52;
        times(nDays);
    }

    private static void times(double nDays) {
        int hours = (int) (nDays*24);
        int minute = (int)((nDays*24-hours)*60);
        int seconds = (int) (((nDays*24-hours)*60-minute)*60);
        System.out.println("I "+nDays+" days: "+hours+" hours, "+minute+" minutes, "+seconds+" seconds.");
    }
}
