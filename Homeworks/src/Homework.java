import java.util.Scanner;

public class Homework {

    public static void main(String[] args){
        int lessonNumber, lessonPointNumber;
        Scanner input = new Scanner(System.in);
//        Лист используемых переменных для задания 1 пункт 3
        int intVal = 10;
        long longVal = 10;
        short shortVal = 10;
        double doubleVal = 10;
        float floatVal = 10;
        char charVal = 10;
        byte byteVal = 10;
        boolean boolenVal = false;

        System.out.println("Введи номер урока для проверки (поддерживаются только целочисленные значения): ");
        lessonNumber = input.nextInt();
        System.out.println("Введи номер задания для проверки: ");
        lessonPointNumber = input.nextInt();
        input.nextLine(); // костыль, подробнее https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

        if (lessonNumber == 1){
            if (lessonPointNumber == 3){
                System.out.println("Для какого примитивного типа будем смотреть выполненное задание?");
                System.out.println("На вход можно указать только: byte, short, char, int, long, float, double, boolean.");
                System.out.print("Введи тип: ");
                String type = input.nextLine().toLowerCase();

                if (type.equals("byte")){

                } else if (type.equals("short")){

                } else if (type.equals("char")){

                } else if (type.equals("int")){
                    intMath(intVal, intVal);
                    intMath(intVal, longVal);
                    intMath(intVal, shortVal);
                    intMath(intVal, doubleVal);
                    intMath(intVal, floatVal);
                    intMath(intVal, charVal);
                    intMath(intVal, byteVal);
                    intMath(intVal, boolenVal);
                } else if (type.equals("long")){

                } else if (type.equals("float")){

                } else if (type.equals("double")){

                } else if (type.equals("boolean")){

                } else System.out.println("Не удалось распознать ввод. Конец программы.");





            } else if (lessonPointNumber == 4)
            {
                System.out.println("Для готового примера введи 0, для того что бы считать значения с клавиатуры введи 1 (поддерживаются только целочисленные значения): ");
                int linearEquationExample = input.nextInt();
                if (linearEquationExample == 0)
                {
                    linearEquation(5, 8);
                } else if (linearEquationExample == 1)
                {
                    System.out.println("На вход доступны только значения типа double!");
                    System.out.println("Введи первое значение:");
                    double firstDouble = input.nextDouble();
                    System.out.println("Введи второе значение:");
                    double secondDouble = input.nextDouble();
                    linearEquation(firstDouble, secondDouble);
                } else System.out.println("Для ввода доступны только 1 и 0, перезапусти программу.");
            } else System.out.println("По этому заданию ничего нет :(");
        } else System.out.println("По этому уроку ничего нет :(");



    }

//   Домашнее задание 1 пункт 3
//
//
//
//
    public static void intMath(int a, int b){
        System.out.println("\nУрок 1, задание 3, тип int:\n");
        System.out.print("Сумма двух int: ");
        System.out.println(a + b);
        instanceOfCheck(a + b);
    }

    public static void intMath(int a, long b){
        System.out.print("Сумма int и long: ");
        System.out.println(a + b);
        instanceOfCheck(a + b);
    }

    public static void intMath(int a, short b){
        System.out.print("Сумма int и short: ");
        System.out.println(a + b);
        instanceOfCheck(a + b);
    }

    public static void intMath(int a, double b){
        System.out.print("Сумма int и double: ");
        System.out.println(a + b);
        instanceOfCheck(a + b);
    }

    public static void intMath(int a, float b){
        System.out.print("Сумма int и float: ");
        System.out.println(a + b);
        instanceOfCheck(a + b);
    }

    public static void intMath(int a, char b){
        System.out.print("Сумма int и char: ");
        System.out.println(a + b);
        instanceOfCheck(a + b);
    }

    public static void intMath(int a, byte b){
        System.out.print("Сумма int и byteVal: ");
        System.out.println(a + b);
        instanceOfCheck(a + b);
    }

    public static void intMath(int a, boolean b){
        System.out.print("Сумма int и boolean: ");
        System.out.println("Неприменимо.");
    }

    // Перегрузка метода instanceOfCheck для отпределения типа итогового значения
    public static void instanceOfCheck(byte i) {
        System.out.println("Я byte!\n");
    }

    public static void instanceOfCheck(short i) {
        System.out.println("Я short!\n");
    }

    public static void instanceOfCheck(char i) {
        System.out.println("Я char!\n");
    }

    public static void instanceOfCheck(int i) {
        System.out.println("Я int!\n");
    }

    public static void instanceOfCheck(long i) {
        System.out.println("Я long!\n");
    }

    public static void instanceOfCheck(float i) {
        System.out.println("Я float!\n");
    }

    public static void instanceOfCheck(double i) {
        System.out.println("Я double!\n");
    }

    public static void instanceOfCheck(boolean i) {
        System.out.println("Я boolean!\n");
    }


    //    Домашнее задание 1 пункт 4
//    Написать программу осуществляющую решение линейного уравнения ax + b = 0. a и b задаете в программе, х выводите на экран.
//
//    В задании ничего не сказано о типах для переменных a и b,
//    поэтому выбор оставляю за собой, пусть для наглядности это будет тип double.
    public static void linearEquation(double a, double b){ // объявляю метод и принимаю на вход две перменные типа double
        System.out.println("\nУрок 1, задание 4:");
        System.out.println("Решаем уравнение: " + a + "x" + " + " + b + " = 0"); // использую конкатенацию строк что бы вывести наглядное сообщение
        System.out.println(-b/a + "\n"); // отступ добавил для читабельности в консоле
    }
}
