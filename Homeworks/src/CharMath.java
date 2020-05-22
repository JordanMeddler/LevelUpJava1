public class CharMath {
    public static void charMath(char a, char b) {
        System.out.println("\nУрок 1, задание 3, тип char:\n");
        System.out.print("Сумма двух char: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void charMath(char a, int b) {
        System.out.print("Сумма char и int: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void charMath(char a, short b) {
        System.out.print("Сумма char и short: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void charMath(char a, float b) {
        System.out.print("Сумма char и float: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void charMath(char a, long b) {
        System.out.print("Сумма char и long: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void charMath(char a, double b) {
        System.out.print("Сумма char и double: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void charMath(char a, byte b) {
        System.out.print("Сумма char и byte: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void charMath(char a, boolean b) {
        System.out.print("Сумма char и boolean: ");
        System.out.println("Неприменимо.");
    }
}
