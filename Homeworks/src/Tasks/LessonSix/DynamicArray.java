package Tasks.LessonSix;


public class DynamicArray extends AbstractStructure {

    private int[] elements;

    public DynamicArray(int initialCapacity) {
        this.elements = new int[initialCapacity];
        this.size = 0;
    }

    @Override
    public void add(int value) {
        if (size == elements.length) {
            int[] oldElements = elements;
            elements = new int[(int) (elements.length * 1.5)];
            System.arraycopy(oldElements, 0, elements, 0, oldElements.length);
        }
        elements[size++] = value;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void remove(int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                int[] oldElements = elements;
                elements = new int[oldElements.length - 1];
                System.arraycopy(oldElements, 0, elements, 0, i);
                System.arraycopy(oldElements, ++i, elements, --i, oldElements.length - ++i);
            }
        }
    }

    // TODO Remove - only testing purposes
    public void print() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
        System.out.println("size is: " + size);
    }

    public void trim() {
        if (size < elements.length) {
            int[] oldElements = elements;
            elements = new int[size];
            System.arraycopy(oldElements, 0, elements, 0, size);
        }
    }
}
