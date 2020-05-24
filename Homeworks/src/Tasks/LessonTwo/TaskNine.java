package Tasks.LessonTwo;

public class TaskNine {
    //    Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 …
    public static void firstTwenty() {
        int start = 2;
        int counter = 0;
        do {
            System.out.print(start + " ");
            start += start;
            counter++;
        } while (counter < 20);
    }
}
