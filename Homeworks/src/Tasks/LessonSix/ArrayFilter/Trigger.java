package Tasks.LessonSix.ArrayFilter;

public class Trigger {
    public static void main() {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;


        ArrayFilter arrayFilter = new ArrayFilter();
        Filter filter = new Filter() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        };

        arrayFilter.filter(array, filter);
    }
}
