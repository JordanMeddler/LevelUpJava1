package Tasks.LessonThree;

public class Calculator {
/*    Создать класс Calculator. У него должны быть методы:
            1. Сумма
            2. Деление
            3. Умножение
            4. Вычитание
      Все методы должны быть перегружены и работать с тремя типами - double, long и int.*/
    // Не очень понял нужно ли миксовать между собой типы,
    // а так же должны ди метожы возвращать значение или выводить на экран.

    // Секция суммы
    public static double sum(double a, double b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    // Секция деления
    public static double division(double a, double b) {
        return a / b;
    }

    public static long division(long a, long b) {
        return a / b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    // Секция умножение
    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static long multiplication(long a, long b) {
        return a * b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    // Секция вычитание
    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static long subtraction(long a, long b) {
        return a - b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

}
