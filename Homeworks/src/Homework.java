import Tasks.LessonFour.userInterfaceLessonFour;
import Tasks.LessonOne.TaskFour;
import Tasks.LessonOne.TaskThree;
import Tasks.LessonTwo.TaskOne;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // для чтения ввода с клавиатуры
        int lessonNumber, lessonPointNumber; // для записи выбранного урока и выбранного пункта урока

        System.out.println("Введи номер урока для проверки (поддерживаются только целочисленные значения): ");
        lessonNumber = input.nextInt();
        System.out.println("Введи номер задания для проверки: ");
        lessonPointNumber = input.nextInt();
        input.nextLine(); // костыль, подробнее https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

        // УРОК 1
        if (lessonNumber == 1) {
            if (lessonPointNumber == 3) {
                System.out.println("Для какого примитивного типа будем смотреть выполненное задание?");
                System.out.println("На вход можно указать только: byte, short, char, int, long, float, double, boolean.");
                System.out.print("Введи тип: ");
                // Немного отказоустойчивости ,но это практически бессмысленно так как приложение очень
                // не дружелюбно - принимает только конкретные значения и не обрабатывает никакие исключения
                String type = input.nextLine().toLowerCase();
                TaskThree.taskThree(type); // Прокидываем введенный тип в класс Tasks.LessonOne.TaskThree внутрь метода taskThree
            } else if (lessonPointNumber == 4) {
                System.out.println("Для готового примера введи 0, для того что бы считать значения с клавиатуры введи 1 (поддерживаются только целочисленные значения): ");
                int linearEquationExample = input.nextInt();
                if (linearEquationExample == 0) {
                    TaskFour.linearEquation(5, 8);
                } else if (linearEquationExample == 1) {
                    System.out.println("На вход доступны только значения типа double!");
                    System.out.println("Введи первое значение:");
                    double firstDouble = input.nextDouble();
                    System.out.println("Введи второе значение:");
                    double secondDouble = input.nextDouble();
                    TaskFour.linearEquation(firstDouble, secondDouble);
                } else System.out.println("Для ввода доступны только 1 и 0, перезапусти программу.");
            } else System.out.println("По этому заданию ничего нет :(");
            // УРОК 2
        } else if (lessonNumber == 2) {
            if (lessonPointNumber == 1) {
                System.out.println("Введите целочисленное значение для проверки четности: ");
                int eventOddVal = input.nextInt();
                TaskOne.eventOdd(eventOddVal);
            } else if (lessonPointNumber == 2) {
                double inputFirst, inputSecond;
                System.out.println("Необходимо ввести два положительных числа. Ввести отрицательные даже не пытайтесь!");
                System.out.println("Введите первое положительное число: ");
                // В вопросе является ли ноль положительным числом я воспрользовался этой статьей
                // https://en.wikipedia.org/wiki/Sign_(mathematics)#Sign_of_zero
                // так что в данном задании сичтаю ноль ни положительным, ни отрицательным.
                inputFirst = input.nextDouble();
                if (inputFirst < 0) {
                    System.out.println("C'mon bro! Я же попросил только положительное число!");
                } else if (inputFirst == 0) {
                    System.out.println("C'mon bro! Я же попросил только положительное число!");
                    System.out.print("Если хочешь поспорить о положительности ноля, тебе сюда: ");
                    System.out.println("https://en.wikipedia.org/wiki/Sign_(mathematics)#Sign_of_zero");
                } else {
                    System.out.println("Введите второе положительное число: ");
                    inputSecond = input.nextDouble();
                    if (inputSecond < 0) {
                        System.out.println("C'mon bro! Я же попросил только положительное число!");
                    } else if (inputSecond == 0) {
                        System.out.println("C'mon bro! Я же попросил только положительное число!");
                        System.out.print("Если хочешь поспорить о положительности ноля, тебе сюда: ");
                        System.out.println("https://en.wikipedia.org/wiki/Sign_(mathematics)#Sign_of_zero");
                    } else Tasks.LessonTwo.TaskTwo.nearTen(inputFirst, inputSecond);
                }
            } else if (lessonPointNumber == 3) {
                Tasks.LessonTwo.TaskThree.randomInInterval();
            } else if (lessonPointNumber == 4) {
                Tasks.LessonTwo.TaskFour.threeAndMore();
            } else if (lessonPointNumber == 5) {
                Tasks.LessonTwo.TaskFive.threeVariables();
            } else if (lessonPointNumber == 6) {
                Tasks.LessonTwo.TaskSix.six();
            } else if (lessonPointNumber == 7) {
                Tasks.LessonTwo.TaskSeven.fiftyFive();
            } else if (lessonPointNumber == 8) {
                Tasks.LessonTwo.TaskEight.backwards();
            } else if (lessonPointNumber == 9) {
                Tasks.LessonTwo.TaskNine.firstTwenty();
            } else if (lessonPointNumber == 10) {
                System.out.println("Пожалуйста введите натуральное число.");
                System.out.println("Натуральные числа - числа, возникающие естественным образом при счёте (например, 1, 2, 3, 4, …)");
                System.out.println("Ваш ввод: ");
                int natural = input.nextInt();
                if (natural <= 0) {
                    System.out.println("Вы ввели не натуральное число.");
                } else Tasks.LessonTwo.TaskTen.factorial(natural);
            } else if (lessonPointNumber == 11) {
                System.out.println("Введите натуральное число: ");
                int natural = input.nextInt();
                if (natural <= 0) {
                    System.out.println("Некорректный ввод. Натуральные числа - числа, возникающие естественным образом при счёте (например, 1, 2, 3, 4, …)");
                } else Tasks.LessonTwo.TaskEleven.wtf(natural);
            } else System.out.println("По этому заданию ничего нет :(");
            // УРОК 3
        } else if (lessonNumber == 3) {
            if (lessonPointNumber == 1) {
                System.out.println("Выберете операцию, для ввода допустимы только sum, division, multiplication и subtraction: ");
                String operation = input.next().toLowerCase();
                input.nextLine();
                System.out.println("Выберете тип переменных с которыми будете работать (доступны типы double, long и int): ");
                String type = input.nextLine().toLowerCase();
                // Обрабатываем сумму
                if (operation.equals("sum") & type.equals("double")) {
                    System.out.println("Введите первый double: ");
                    double double1 = input.nextDouble();
                    System.out.println("Введите второй double: ");
                    double double2 = input.nextDouble();
                    System.out.println("Сумма введенных double: " + Tasks.LessonThree.Calculator.sum(double1, double2));
                } else if (operation.equals("sum") & type.equals("long")) {
                    System.out.println("Введите первый long: ");
                    long long1 = input.nextLong();
                    System.out.println("Введите второй long: ");
                    long long2 = input.nextLong();
                    System.out.println("Сумма введенных long: " + Tasks.LessonThree.Calculator.sum(long1, long2));
                } else if (operation.equals("sum") & type.equals("int")) {
                    System.out.println("Введите первый int: ");
                    int int1 = input.nextInt();
                    System.out.println("Введите второй int: ");
                    int int2 = input.nextInt();
                    System.out.println("Сумма введенных int: " + Tasks.LessonThree.Calculator.sum(int1, int2));
                    // Обрабатываем деление
                } else if (operation.equals("division") & type.equals("double")) {
                    System.out.println("Введите первый double: ");
                    double double1 = input.nextDouble();
                    System.out.println("Введите второй double: ");
                    double double2 = input.nextDouble();
                    System.out.println("Деление введенных double: " + Tasks.LessonThree.Calculator.division(double1, double2));
                } else if (operation.equals("division") & type.equals("long")) {
                    System.out.println("Введите первый long: ");
                    long long1 = input.nextLong();
                    System.out.println("Введите второй long: ");
                    long long2 = input.nextLong();
                    System.out.println("Деление введенных long: " + Tasks.LessonThree.Calculator.division(long1, long2));
                } else if (operation.equals("division") & type.equals("int")) {
                    System.out.println("Введите первый int: ");
                    int int1 = input.nextInt();
                    System.out.println("Введите второй int: ");
                    int int2 = input.nextInt();
                    System.out.println("Деление введенных int: " + Tasks.LessonThree.Calculator.division(int1, int2));
                    // Обрабатываем умножение
                } else if (operation.equals("multiplication") & type.equals("double")) {
                    System.out.println("Введите первый double: ");
                    double double1 = input.nextDouble();
                    System.out.println("Введите второй double: ");
                    double double2 = input.nextDouble();
                    System.out.println("Умножение введенных double: " + Tasks.LessonThree.Calculator.multiplication(double1, double2));
                } else if (operation.equals("multiplication") & type.equals("long")) {
                    System.out.println("Введите первый long: ");
                    long long1 = input.nextLong();
                    System.out.println("Введите второй long: ");
                    long long2 = input.nextLong();
                    System.out.println("Умножение введенных long: " + Tasks.LessonThree.Calculator.multiplication(long1, long2));
                } else if (operation.equals("multiplication") & type.equals("int")) {
                    System.out.println("Введите первый int: ");
                    int int1 = input.nextInt();
                    System.out.println("Введите второй int: ");
                    int int2 = input.nextInt();
                    System.out.println("Умножение введенных int: " + Tasks.LessonThree.Calculator.multiplication(int1, int2));
                    // Обрабатываем вычитание
                } else if (operation.equals("subtraction") & type.equals("double")) {
                    System.out.println("Введите первый double: ");
                    double double1 = input.nextDouble();
                    System.out.println("Введите второй double: ");
                    double double2 = input.nextDouble();
                    System.out.println("Вычитание введенных double: " + Tasks.LessonThree.Calculator.subtraction(double1, double2));
                } else if (operation.equals("subtraction") & type.equals("long")) {
                    System.out.println("Введите первый long: ");
                    long long1 = input.nextLong();
                    System.out.println("Введите второй long: ");
                    long long2 = input.nextLong();
                    System.out.println("Вычитание введенных long: " + Tasks.LessonThree.Calculator.subtraction(long1, long2));
                } else if (operation.equals("subtraction") & type.equals("int")) {
                    System.out.println("Введите первый int: ");
                    int int1 = input.nextInt();
                    System.out.println("Введите второй int: ");
                    int int2 = input.nextInt();
                    System.out.println("Вычитание введенных int: " + Tasks.LessonThree.Calculator.subtraction(int1, int2));
                } else System.out.println("Неккоректный ввод.");
            } else if (lessonPointNumber == 2) {
                int[] array = new int[5];
                System.out.println("Введите массив int[5] по одному значению (обязательно только int!): ");
                for (int arrayInput = 0; arrayInput < array.length; arrayInput++) {
                    array[arrayInput] = input.nextInt();
                }
                input.nextLine();
                System.out.println("Введите что вам найти - min или max?: ");
                String search = input.nextLine();
                if (search.toLowerCase().equals("min")) {
                    int answer = Tasks.LessonThree.ArrayUtil.min(array);
                    System.out.println("Минимальное число что вы ввели - это " + answer);
                } else if (search.toLowerCase().equals("max")) {
                    int answer = Tasks.LessonThree.ArrayUtil.max(array);
                    System.out.println("Максимальное число что вы ввели - это " + answer);
                } else System.out.println("Некорректный ввод.");
            } else System.out.println("По этому заданию ничего нет :(");
        } else if (lessonNumber == 4) {
            if (lessonPointNumber == 1) {
                userInterfaceLessonFour.quadrantInterface();
            } else if (lessonPointNumber == 2) {
                Tasks.LessonFour.userInterfaceLessonFour.flipInterface();
            } else if (lessonPointNumber == 3) {
                Tasks.LessonFour.userInterfaceLessonFour.twoRectangles();
            } else System.out.println("По этому заданию ничего нет :(");
        } else if (lessonNumber == 5) {
            Tasks.LessonFive.EntityApp.showArray();
        } else if (lessonNumber == 6) {
            if (lessonPointNumber == 1) {
                Tasks.LessonSix.StructureApp.main();
            } else if (lessonPointNumber == 2) {

            } else if (lessonPointNumber == 3) {
                Tasks.LessonSix.ArrayFilter.Trigger.main();
            } else System.out.println("По этому заданию ничего нет :(");
        } else System.out.println("По этому уроку ничего нет :(");
    }
}


