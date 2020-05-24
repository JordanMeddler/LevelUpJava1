package Tasks.LessonTwo;

public class TaskEleven {
    //    Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
    public static void wtf(int a) {
        for (int i = 1; i <= a; i++){
            if (a % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
