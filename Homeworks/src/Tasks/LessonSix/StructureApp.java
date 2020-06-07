package Tasks.LessonSix;

public class StructureApp {
    public static void main() {
        DynamicArray array = new DynamicArray(4);

        array.add(100);
        array.add(101);
        array.add(102);
        array.add(103);
        array.add(104);
        array.add(105);
        array.add(106);
        array.add(107);
        array.add(108);

        Structure structure = new DynamicArray(3);
        structure.add(10);
        structure.add(11);
        structure.add(12);
        structure.add(13);
        structure.add(14);
        structure.add(15);
        structure.add(16);

        array.remove(109);
//        array.print();

        DynamicArray trimTest = new DynamicArray(10);
        trimTest.add(1);
        trimTest.add(2);
        trimTest.add(3);
        trimTest.add(4);

        trimTest.print();
        trimTest.trim();
        trimTest.print();
    }

}
