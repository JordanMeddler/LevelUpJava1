package Tasks.LessonFive;

public class EntityApp {
    public static void showArray() {
        Entity[] entitiesArray = new Entity[5];

        entitiesArray[0] = new Entity("First", 1);
        entitiesArray[1] = new Entity("Second", 2);
        entitiesArray[2] = new Entity("Third", 3);
        entitiesArray[3] = new Entity("Fourth", 4);
        entitiesArray[4] = new Entity("Fifth", 5);

        Entity findMe = new Entity("Fourth", 1);
        EntityService service = new EntityService();

        if (service.contains(entitiesArray, findMe)) {
            int arrayIndex = service.searchArrayIndex(entitiesArray, findMe);
            entitiesArray[arrayIndex] = null;
        }

        service.arraySort(entitiesArray);
        service.print(entitiesArray);
    }
}
