package Tasks.LessonFive;

import java.util.Objects;

public class Entity {
    private String entityName;
    private int entityValue;

    public Entity(String entityName, int entityValue) {
        this.entityName = entityName;
        this.entityValue = entityValue;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public int getEntityValue() {
        return entityValue;
    }

    public void setEntityValue(int entityValue) {
        this.entityValue = entityValue;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Entity other = (Entity) object;
        return Objects.equals(entityName, other.entityName) && entityValue == other.entityValue;
    }

    @Override
    public int hashCode(){
        return Objects.hash(entityName, entityValue);
    }

    public String printEntity() {
        return "Entity name: " + entityName + " and entity value: " + entityValue + ".";
    }
}
