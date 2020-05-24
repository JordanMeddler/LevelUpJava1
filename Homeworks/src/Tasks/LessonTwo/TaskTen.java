package Tasks.LessonTwo;

public class TaskTen {
    //    Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
    public static void factorial(int a) {
        int result = 1; // Получается что итоговое значение ограничено размером int

        for (int i = 1; i <= a; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
