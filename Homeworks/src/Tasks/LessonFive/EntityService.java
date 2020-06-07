package Tasks.LessonFive;

public class EntityService {
    boolean contains(Object[] array, Object object) {
        int objectHash = object.hashCode();
        for (Object o : array) {
            if (o.hashCode() == objectHash && o.equals(object)) {
                return true;
            }
        }
        return false;
    }

    int searchArrayIndex(Object[] array, Object object) {
        int objectHash = object.hashCode();
        for (int i = 0; i < array.length; i++) {
            if (array[i].hashCode() == objectHash && array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public void print(Entity[] entitiesArray) {
        for (Entity entity : entitiesArray) {
            if (entity != null) {
                System.out.println(entity.printEntity());
            }
        }
    }

    void arraySort(Entity[] entitiesArray) {
        for (int i = 0; i < entitiesArray.length - 1; i++) {
            // сознательно переопределяю j каждый раз как занового вхожу в for
            int j = 1;
            if (entitiesArray[i] == null) {
                entitiesArray[i] = entitiesArray[j + i];
                entitiesArray[j + i] = null;
            }
        }
    }

}
