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
            }
        } else System.out.println("По этому уроку ничего нет :(");
    }
}
