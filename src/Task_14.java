public class Task_14 {
    /*
     Создайте метод, который будет считать сколько денег получает работник в неделю.
     Метод должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).
Условия:
1) Каждый час после 40 считается за полтора.
2) Работник не может работать больше, чем 60 часов в неделю.
3) Работник не может получать меньше 8 долларов в час.
     */
    public static void main(String[] args) {
        int paymentInHour = 10;
        int hours = 45;
        payment(paymentInHour, hours);
    }

    private static void payment(int paymentInHour, int hours) {
        double payment=0;
        if ((hours<=40)&&(paymentInHour>=8)){
            payment = paymentInHour*hours;
            System.out.println(payment);
        }
        else if ((hours>40)&&(hours<60)&&(paymentInHour>=8)){
            payment = paymentInHour*hours*40+(hours-40)*1.5*paymentInHour;
            System.out.println(payment);
        }
        else {
            System.out.println("Error");
        }



    }
}
