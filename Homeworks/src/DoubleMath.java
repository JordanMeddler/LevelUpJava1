public class DoubleMath {
    public static void doubleMath(double a, double b) {
        System.out.println("\nУрок 1, задание 3, тип double:\n");
        System.out.print("Сумма двух double: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void doubleMath(double a, int b) {
        System.out.print("Сумма double и int: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void doubleMath(double a, short b) {
        System.out.print("Сумма double и short: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void doubleMath(double a, float b) {
        System.out.print("Сумма double и float: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void doubleMath(double a, long b) {
        System.out.print("Сумма double и long: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void doubleMath(double a, char b) {
        System.out.print("Сумма double и char: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void doubleMath(double a, byte b) {
        System.out.print("Сумма double и byte: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void doubleMath(double a, boolean b) {
        System.out.print("Сумма double и boolean: ");
        System.out.println("Неприменимо.");
    }
}
