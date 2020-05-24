package Tasks.LessonTwo;

import java.util.Random;

public class TaskThree {
//    Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.
    public static void randomInInterval() {
        Random r = new Random();
        int randomGenerated = r.nextInt(150) + 5;
        boolean result = randomGenerated > 25 && randomGenerated < 100 ? true : false;
        if (result) {
            System.out.println("Число " + randomGenerated + " содержится в интервале (25,100).");
        } else System.out.println("Число " + randomGenerated + " не содержится в интервале (25,100).");
    }
}
