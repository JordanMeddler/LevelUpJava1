package Tasks.LessonSix;

import java.io.Serializable;

public abstract class AbstractStructure implements Structure, Serializable {

    protected int size;

    @Override
    public int getSize() {
        return size;
    }
}
