package Tasks.LessonTwo;

public class TaskSeven {
    // Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …
    public static void fiftyFive() {
        int start = 1;
        int counter = 0;
        do {
            if (start % 2 != 0) {
                System.out.print(start + " ");
                start++;
                counter++;
            } else start++;
        } while (counter < 55);
    }
}
