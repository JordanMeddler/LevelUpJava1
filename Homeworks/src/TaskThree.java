public class TaskThree {


    public static void taskThree(String type) {

//   Лист используемых переменных для задания 1 пункт 3
        int intVal = 10;
        long longVal = 10;
        short shortVal = 10;
        double doubleVal = 10;
        float floatVal = 10;
        char charVal = 10;
        byte byteVal = 10;
        boolean boolenVal = false;

        if (type.equals("byte")) {
            ByteMath.byteMath(byteVal, byteVal);
            ByteMath.byteMath(byteVal, longVal);
            ByteMath.byteMath(byteVal, charVal);
            ByteMath.byteMath(byteVal, doubleVal);
            ByteMath.byteMath(byteVal, floatVal);
            ByteMath.byteMath(byteVal, intVal);
            ByteMath.byteMath(byteVal, shortVal);
            ByteMath.byteMath(byteVal, boolenVal);
        } else if (type.equals("short")) {
            ShortMath.shortMath(shortVal, shortVal);
            ShortMath.shortMath(shortVal, longVal);
            ShortMath.shortMath(shortVal, charVal);
            ShortMath.shortMath(shortVal, doubleVal);
            ShortMath.shortMath(shortVal, floatVal);
            ShortMath.shortMath(shortVal, intVal);
            ShortMath.shortMath(shortVal, byteVal);
            ShortMath.shortMath(shortVal, boolenVal);
        } else if (type.equals("char")) {
            CharMath.charMath(charVal, charVal);
            CharMath.charMath(charVal, longVal);
            CharMath.charMath(charVal, shortVal);
            CharMath.charMath(charVal, doubleVal);
            CharMath.charMath(charVal, floatVal);
            CharMath.charMath(charVal, intVal);
            CharMath.charMath(charVal, byteVal);
            CharMath.charMath(charVal, boolenVal);
        } else if (type.equals("int")) {
            IntMath.intMath(intVal, intVal);
            IntMath.intMath(intVal, longVal);
            IntMath.intMath(intVal, shortVal);
            IntMath.intMath(intVal, doubleVal);
            IntMath.intMath(intVal, floatVal);
            IntMath.intMath(intVal, charVal);
            IntMath.intMath(intVal, byteVal);
            IntMath.intMath(intVal, boolenVal);
        } else if (type.equals("long")) {
            LongMath.longMath(longVal, longVal);
            LongMath.longMath(longVal, intVal);
            LongMath.longMath(longVal, shortVal);
            LongMath.longMath(longVal, doubleVal);
            LongMath.longMath(longVal, floatVal);
            LongMath.longMath(longVal, charVal);
            LongMath.longMath(longVal, byteVal);
            LongMath.longMath(longVal, boolenVal);
        } else if (type.equals("float")) {
            FloatMath.floatMath(floatVal, floatVal);
            FloatMath.floatMath(floatVal, intVal);
            FloatMath.floatMath(floatVal, shortVal);
            FloatMath.floatMath(floatVal, doubleVal);
            FloatMath.floatMath(floatVal, longVal);
            FloatMath.floatMath(floatVal, charVal);
            FloatMath.floatMath(floatVal, byteVal);
            FloatMath.floatMath(floatVal, boolenVal);
        } else if (type.equals("double")) {
            DoubleMath.doubleMath(doubleVal, doubleVal);
            DoubleMath.doubleMath(doubleVal, intVal);
            DoubleMath.doubleMath(doubleVal, shortVal);
            DoubleMath.doubleMath(doubleVal, floatVal);
            DoubleMath.doubleMath(doubleVal, longVal);
            DoubleMath.doubleMath(doubleVal, charVal);
            DoubleMath.doubleMath(doubleVal, byteVal);
            DoubleMath.doubleMath(doubleVal, boolenVal);
        } else if (type.equals("boolean")) {
            BooleanMath.booleanMath(boolenVal, boolenVal);
            BooleanMath.booleanMath(boolenVal, intVal);
            BooleanMath.booleanMath(boolenVal, shortVal);
            BooleanMath.booleanMath(boolenVal, floatVal);
            BooleanMath.booleanMath(boolenVal, longVal);
            BooleanMath.booleanMath(boolenVal, charVal);
            BooleanMath.booleanMath(boolenVal, byteVal);
            BooleanMath.booleanMath(boolenVal, doubleVal);
        } else System.out.println("Не удалось распознать ввод. Конец программы.");
    }
}
