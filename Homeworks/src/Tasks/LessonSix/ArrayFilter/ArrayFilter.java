package Tasks.LessonSix.ArrayFilter;

public class ArrayFilter {

/*    Filter filter = new Filter() {
        @Override
        public boolean test(int value) {
            return value % 2 == 0;
        }
    };*/

    public int[] filter(int[] array, Filter filter){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (filter.test(array[i])){
                newArray[i] = array[i];
                System.out.println(newArray[i]);
            }
        } return newArray;
    }

}
