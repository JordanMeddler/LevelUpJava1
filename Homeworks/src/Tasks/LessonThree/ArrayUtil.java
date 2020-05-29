package Tasks.LessonThree;

public class ArrayUtil {
    public static int min(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (min < array[i]){
                min = array[i];
            }
        }

        return min;
    }

    public static int max(int[] array){
        int max = 0;
        return max;
    }
}
