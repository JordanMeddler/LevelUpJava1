public class ByteMath {
    public static void byteMath(byte a, byte b){
        System.out.println("\nУрок 1, задание 3, тип byte:\n");
        System.out.print("Сумма двух byte: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void byteMath(byte a, int b){
        System.out.print("Сумма byte и int: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void byteMath(byte a, short b){
        System.out.print("Сумма byte и short: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void byteMath(byte a, float b){
        System.out.print("Сумма byte и float: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void byteMath(byte a, long b){
        System.out.print("Сумма byte и long: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void byteMath(byte a, double b){
        System.out.print("Сумма byte и double: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void byteMath(byte a, char b){
        System.out.print("Сумма byte и char: ");
        System.out.println(a + b);
        TypeChecker.instanceOfCheck(a + b);
    }

    public static void byteMath(byte a, boolean b){
        System.out.print("Сумма byte и boolean: ");
        System.out.println("Неприменимо.");
    }
}
