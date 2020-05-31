package Tasks.LessonFour;

import java.util.Scanner;

public class userInterfaceLessonFour {
    public static Scanner input = new Scanner(System.in);
    public static void quadrantInterface() {
        System.out.println("На вход принимаются только int!!!");
        System.out.println("Введите координату х: ");
        int x = input.nextInt();
        System.out.println("Введите координату y: ");
        int y = input.nextInt();
        Point quadrantPoint = new Point(x, y);
        int result = quadrantPoint.quadrant();
        if (result == 0){
            System.out.println("Точка лежит непосредственно на оси x и / или y.");
        } else System.out.println("Точка с указанными координатами лежит в квадранте: " + result);
    }

    public static void flipInterface() {
        System.out.println("На вход принимаются только int!!!");
        System.out.println("Введите координату х: ");
        int x = input.nextInt();
        System.out.println("Введите координату y: ");
        int y = input.nextInt();
        Point beforeFlip = new Point(x, y);
        Point afterFlip = beforeFlip.flip();
        System.out.println("В новом объекте класса Point x = " + afterFlip.getX() + " и у = " + afterFlip.getY());
    }

    public static void twoRectangles() {
        System.out.println("Поддерживается только int!!!");
        System.out.println("Введите координату верхней левой вершины первого прямоугольника: ");
        int upperLeftFirst = input.nextInt();
        System.out.println("Введите координату нижней правой вершины первого прямоугольника: ");
        int bottomRightFirst = input.nextInt();
        System.out.println("Введите координату верхней левой вершины второго прямоугольника: ");
        int upperLeftSecond = input.nextInt();
        System.out.println("Введите координату нижней правой вершины второго прямоугольника: ");
        int bottomRightSecond = input.nextInt();

    }
}
