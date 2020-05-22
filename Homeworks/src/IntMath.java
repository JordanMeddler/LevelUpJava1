public class IntMath {
    public static void intMath(int a, int b) {
        System.out.println("\nУрок 1, задание 3, тип int:\n");
        System.out.print("Сумма двух int: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void intMath(int a, long b) {
        System.out.print("Сумма int и long: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void intMath(int a, short b) {
        System.out.print("Сумма int и short: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void intMath(int a, double b) {
        System.out.print("Сумма int и double: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void intMath(int a, float b) {
        System.out.print("Сумма int и float: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void intMath(int a, char b) {
        System.out.print("Сумма int и char: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void intMath(int a, byte b) {
        System.out.print("Сумма int и byte: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void intMath(int a, boolean b) {
        System.out.print("Сумма int и boolean: ");
        System.out.println("Неприменимо.");
    }
}
