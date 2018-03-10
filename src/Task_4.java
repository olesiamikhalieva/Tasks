public class Task_4 {
    /*
    Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой»
     */
    public static void main(String[] args) {
        String str = "Бяка летом плюет в бяка лес.";
        str = str.replace("бяка", "вырезано цензой");
        System.out.println(str);
    }
}
