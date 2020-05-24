package Tasks.LessonTwo;

public class TaskTwo {
    //    Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел, записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
    public static void nearTen(double a, double b) {
        double constant = 10;
//        Решил сделать через условную операцию, но на сколько я понимаю под капотом там тот же if
        double result = Math.abs(constant - a) < Math.abs(constant - b) ? a : b;
        System.out.println("К 10 ближе число: " + result);
    }
}
