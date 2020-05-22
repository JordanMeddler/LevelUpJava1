public class FloatMath {
    public static void floatMath(float a, float b) {
        System.out.println("\nУрок 1, задание 3, тип float:\n");
        System.out.print("Сумма двух float: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void floatMath(float a, int b) {
        System.out.print("Сумма float и int: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void floatMath(float a, short b) {
        System.out.print("Сумма float и short: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void floatMath(float a, double b) {
        System.out.print("Сумма float и double: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void floatMath(float a, long b) {
        System.out.print("Сумма float и long: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void floatMath(float a, char b) {
        System.out.print("Сумма float и char: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void floatMath(float a, byte b) {
        System.out.print("Сумма float и byte: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void floatMath(float a, boolean b) {
        System.out.print("Сумма float и boolean: ");
        System.out.println("Неприменимо.");
    }
}
