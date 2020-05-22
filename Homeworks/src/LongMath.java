public class LongMath {
    public static void longMath(long a, long b) {
        System.out.println("\nУрок 1, задание 3, тип long:\n");
        System.out.print("Сумма двух long: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void longMath(long a, int b) {
        System.out.print("Сумма long и int: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void longMath(long a, short b) {
        System.out.print("Сумма long и short: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void longMath(long a, double b) {
        System.out.print("Сумма long и double: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void longMath(long a, float b) {
        System.out.print("Сумма long и float: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void longMath(long a, char b) {
        System.out.print("Сумма long и char: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void longMath(long a, byte b) {
        System.out.print("Сумма long и byte: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void longMath(long a, boolean b) {
        System.out.print("Сумма long и boolean: ");
        System.out.println("Неприменимо.");
    }
}
