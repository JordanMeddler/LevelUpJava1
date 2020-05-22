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

        if (lessonNumber == 1) {
            if (lessonPointNumber == 3) {
                System.out.println("Для какого примитивного типа будем смотреть выполненное задание?");
                System.out.println("На вход можно указать только: byte, short, char, int, long, float, double, boolean.");
                System.out.print("Введи тип: ");
                // Немного отказоустойчивости ,но это практически бессмысленно так как приложение очень
                // не дружелюбно - принимает только конкретные значения и не обрабатывает никакие исключения
                String type = input.nextLine().toLowerCase();
                TaskThree.taskThree(type); // Прокидываем введенный тип в класс TaskThree внутрь метода taskThree
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
        } else System.out.println("По этому уроку ничего нет :(");
    }
}
