package Tasks.LessonTwo;

public class TaskSix {
    //    Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
    public static void six() {
        int start = 1000;
        do {
            System.out.print(start + " ");
            start += 3;
        } while (start < 10000);
    }
}
