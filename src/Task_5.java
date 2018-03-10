public class Task_5 {
    /*
    Расчет расстояния до места удара молнии.
    Звук в воздухе распространяется со скоростью приблизительно равной 1100 футам в секунду.
    Зная интервал времени между вспышкой молнии и звуком сопровождающим ее можно рассчитать расстояние.
    Допустим интервал 7,2 секунды.
     */
    public static void main(String[] args) {
        double interval = 7.2;
        destination(interval);
    }

    private static void destination(double interval) {
        double destination = interval * 1100;
        System.out.println("If time is "+interval+". Destination - "+destination+"futov");
    }
}
