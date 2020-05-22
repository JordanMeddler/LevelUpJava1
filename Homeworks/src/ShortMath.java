public class ShortMath {
    public static void shortMath(short a, short b) {
        System.out.println("\nУрок 1, задание 3, тип short:\n");
        System.out.print("Сумма двух short: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void shortMath(short a, int b) {
        System.out.print("Сумма short и int: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void shortMath(short a, char b) {
        System.out.print("Сумма short и char: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void shortMath(short a, float b) {
        System.out.print("Сумма short и float: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void shortMath(short a, long b) {
        System.out.print("Сумма short и long: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void shortMath(short a, double b) {
        System.out.print("Сумма short и double: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void shortMath(short a, byte b) {
        System.out.print("Сумма short и byte: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void shortMath(short a, boolean b) {
        System.out.print("Сумма short и boolean: ");
        System.out.println("Неприменимо.");
    }
}
