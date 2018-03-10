public class Task_12 {
    /*
    Создайте метод, который в качестве аргумента
    получает число и полностью обнуляет столбец, который соответствует заданному числу.
     */
    public static void main(String[] args) {
        int[][] mass = new int[3][4];
        mass[0][0] = 2;
        mass[1][0] = 2;
        mass[0][1] = 2;
        mass[0][2] = 2;
        mass[0][3] = 2;
        mass[1][1] = 2;
        mass[1][2] = 2;
        mass[1][3] = 2;
        int numberColumn = 1;
        method(mass, numberColumn);
        for (int i = 0; i<mass.length; i++){
            for (int j=0; j<mass[i].length; j++){
                System.out.print(mass[i][j]+"\t");
            }
            System.out.println();
        }}


    private static void method(int[][] mass, int numberColumn) {
        if (numberColumn > 0 && numberColumn < mass.length) {
            for (int i = 0; i < mass[numberColumn].length; i++) {
                mass[numberColumn][i] = 0;
            }
        }
    }
}

