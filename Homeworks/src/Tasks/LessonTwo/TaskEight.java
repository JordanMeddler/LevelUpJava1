package Tasks.LessonTwo;

public class TaskEight {
    //    Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
    public static void backwards( ) {
        int start = 90;
        do {
            System.out.print(start + " ");
            start -= 5;
        } while (start > 0); // про ноль отрицательный или нет уже писад :)
    }
}
