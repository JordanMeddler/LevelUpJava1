package Tasks.LessonTwo;

import java.util.Random;

public class TaskFour {
//    Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
    public static void threeAndMore() {
        Random r = new Random();
        int m = r.nextInt(900) + 100;
        int outputOriginal = m;
        int[] array = new int[3];
//      Записываю в массив каждый символ трех значного числа
        for (int i = 0; i < array.length; i++) {
            array[i] = m % 10;
            m /= 10;
        }
//      Иду по массиву и с помощью переменной output ищу наибольшее число
        int output = 0;
        for (int value : array) {
            if (value > output) {
                output = value;
            }
        }
        System.out.println("В числе " + outputOriginal + " наибольшая цифра " + output + ".");
    }
}
