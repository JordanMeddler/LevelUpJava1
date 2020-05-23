package Tasks.LessonOne;

import Maths.*;

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
        boolean booleanVal = false;


        if (type.equals("byte")) {
            ByteMath.byteMathSum(byteVal, byteVal);
            ByteMath.byteMathSum(byteVal, longVal);
            ByteMath.byteMathSum(byteVal, charVal);
            ByteMath.byteMathSum(byteVal, doubleVal);
            ByteMath.byteMathSum(byteVal, floatVal);
            ByteMath.byteMathSum(byteVal, intVal);
            ByteMath.byteMathSum(byteVal, shortVal);
            ByteMath.byteMathSum(byteVal, booleanVal);

            ByteMath.byteMathSubtraction(byteVal, byteVal);
            ByteMath.byteMathSubtraction(byteVal, shortVal);
            ByteMath.byteMathSubtraction(byteVal, intVal);
            ByteMath.byteMathSubtraction(byteVal, floatVal);
            ByteMath.byteMathSubtraction(byteVal, longVal);
            ByteMath.byteMathSubtraction(byteVal, charVal);
            ByteMath.byteMathSubtraction(byteVal, doubleVal);
            ByteMath.byteMathSubtraction(byteVal, booleanVal);

            ByteMath.byteMathMultiplication(byteVal, byteVal);
            ByteMath.byteMathMultiplication(byteVal, shortVal);
            ByteMath.byteMathMultiplication(byteVal, intVal);
            ByteMath.byteMathMultiplication(byteVal, floatVal);
            ByteMath.byteMathMultiplication(byteVal, longVal);
            ByteMath.byteMathMultiplication(byteVal, charVal);
            ByteMath.byteMathMultiplication(byteVal, doubleVal);
            ByteMath.byteMathMultiplication(byteVal, booleanVal);

            ByteMath.byteMathDivision(byteVal, byteVal);
            ByteMath.byteMathDivision(byteVal, shortVal);
            ByteMath.byteMathDivision(byteVal, intVal);
            ByteMath.byteMathDivision(byteVal, floatVal);
            ByteMath.byteMathDivision(byteVal, longVal);
            ByteMath.byteMathDivision(byteVal, charVal);
            ByteMath.byteMathDivision(byteVal, doubleVal);
            ByteMath.byteMathDivision(byteVal, booleanVal);
        } else if (type.equals("short")) {
            ShortMath.shortMathInt(shortVal, shortVal);
            ShortMath.shortMathInt(shortVal, longVal);
            ShortMath.shortMathInt(shortVal, charVal);
            ShortMath.shortMathInt(shortVal, doubleVal);
            ShortMath.shortMathInt(shortVal, floatVal);
            ShortMath.shortMathInt(shortVal, intVal);
            ShortMath.shortMathInt(shortVal, byteVal);
            ShortMath.shortMathInt(shortVal, booleanVal);

            ShortMath.shortMathSubtraction(shortVal, shortVal);
            ShortMath.shortMathSubtraction(shortVal, longVal);
            ShortMath.shortMathSubtraction(shortVal, intVal);
            ShortMath.shortMathSubtraction(shortVal, doubleVal);
            ShortMath.shortMathSubtraction(shortVal, floatVal);
            ShortMath.shortMathSubtraction(shortVal, charVal);
            ShortMath.shortMathSubtraction(shortVal, byteVal);
            ShortMath.shortMathSubtraction(shortVal, booleanVal);

            ShortMath.shortMathMultiplication(shortVal, shortVal);
            ShortMath.shortMathMultiplication(shortVal, longVal);
            ShortMath.shortMathMultiplication(shortVal, intVal);
            ShortMath.shortMathMultiplication(shortVal, doubleVal);
            ShortMath.shortMathMultiplication(shortVal, floatVal);
            ShortMath.shortMathMultiplication(shortVal, charVal);
            ShortMath.shortMathMultiplication(shortVal, byteVal);
            ShortMath.shortMathMultiplication(shortVal, booleanVal);

            ShortMath.shortMathDivision(shortVal, shortVal);
            ShortMath.shortMathDivision(shortVal, longVal);
            ShortMath.shortMathDivision(shortVal, intVal);
            ShortMath.shortMathDivision(shortVal, doubleVal);
            ShortMath.shortMathDivision(shortVal, floatVal);
            ShortMath.shortMathDivision(shortVal, charVal);
            ShortMath.shortMathDivision(shortVal, byteVal);
            ShortMath.shortMathDivision(shortVal, booleanVal);
        } else if (type.equals("char")) {
            CharMath.charMathSum(charVal, charVal);
            CharMath.charMathSum(charVal, longVal);
            CharMath.charMathSum(charVal, shortVal);
            CharMath.charMathSum(charVal, doubleVal);
            CharMath.charMathSum(charVal, floatVal);
            CharMath.charMathSum(charVal, intVal);
            CharMath.charMathSum(charVal, byteVal);
            CharMath.charMathSum(charVal, booleanVal);

            CharMath.charMathSubtraction(charVal, charVal);
            CharMath.charMathSubtraction(charVal, shortVal);
            CharMath.charMathSubtraction(charVal, intVal);
            CharMath.charMathSubtraction(charVal, floatVal);
            CharMath.charMathSubtraction(charVal, longVal);
            CharMath.charMathSubtraction(charVal, byteVal);
            CharMath.charMathSubtraction(charVal, doubleVal);
            CharMath.charMathSubtraction(charVal, booleanVal);

            CharMath.charMathMultiplication(charVal, charVal);
            CharMath.charMathMultiplication(charVal, shortVal);
            CharMath.charMathMultiplication(charVal, intVal);
            CharMath.charMathMultiplication(charVal, floatVal);
            CharMath.charMathMultiplication(charVal, longVal);
            CharMath.charMathMultiplication(charVal, byteVal);
            CharMath.charMathMultiplication(charVal, doubleVal);
            CharMath.charMathMultiplication(charVal, booleanVal);

            CharMath.charMathDivision(charVal, charVal);
            CharMath.charMathDivision(charVal, shortVal);
            CharMath.charMathDivision(charVal, intVal);
            CharMath.charMathDivision(charVal, floatVal);
            CharMath.charMathDivision(charVal, longVal);
            CharMath.charMathDivision(charVal, byteVal);
            CharMath.charMathDivision(charVal, doubleVal);
            CharMath.charMathDivision(charVal, booleanVal);
        } else if (type.equals("int")) {
            IntMath.intMathSum(intVal, intVal);
            IntMath.intMathSum(intVal, longVal);
            IntMath.intMathSum(intVal, shortVal);
            IntMath.intMathSum(intVal, doubleVal);
            IntMath.intMathSum(intVal, floatVal);
            IntMath.intMathSum(intVal, charVal);
            IntMath.intMathSum(intVal, byteVal);
            IntMath.intMathSum(intVal, booleanVal);

            IntMath.intMathSubtraction(intVal, intVal);
            IntMath.intMathSubtraction(intVal, longVal);
            IntMath.intMathSubtraction(intVal, shortVal);
            IntMath.intMathSubtraction(intVal, doubleVal);
            IntMath.intMathSubtraction(intVal, floatVal);
            IntMath.intMathSubtraction(intVal, charVal);
            IntMath.intMathSubtraction(intVal, byteVal);
            IntMath.intMathSubtraction(intVal, booleanVal);

            IntMath.intMathMultiplication(intVal, intVal);
            IntMath.intMathMultiplication(intVal, longVal);
            IntMath.intMathMultiplication(intVal, shortVal);
            IntMath.intMathMultiplication(intVal, doubleVal);
            IntMath.intMathMultiplication(intVal, floatVal);
            IntMath.intMathMultiplication(intVal, charVal);
            IntMath.intMathMultiplication(intVal, byteVal);
            IntMath.intMathMultiplication(intVal, booleanVal);

            IntMath.intMathDivision(intVal, intVal);
            IntMath.intMathDivision(intVal, longVal);
            IntMath.intMathDivision(intVal, shortVal);
            IntMath.intMathDivision(intVal, doubleVal);
            IntMath.intMathDivision(intVal, floatVal);
            IntMath.intMathDivision(intVal, charVal);
            IntMath.intMathDivision(intVal, byteVal);
            IntMath.intMathDivision(intVal, booleanVal);
        } else if (type.equals("long")) {
            LongMath.longMathSum(longVal, longVal);
            LongMath.longMathSum(longVal, intVal);
            LongMath.longMathSum(longVal, shortVal);
            LongMath.longMathSum(longVal, doubleVal);
            LongMath.longMathSum(longVal, floatVal);
            LongMath.longMathSum(longVal, charVal);
            LongMath.longMathSum(longVal, byteVal);
            LongMath.longMathSum(longVal, booleanVal);

            LongMath.longMathSubtraction(longVal, longVal);
            LongMath.longMathSubtraction(longVal, shortVal);
            LongMath.longMathSubtraction(longVal, intVal);
            LongMath.longMathSubtraction(longVal, doubleVal);
            LongMath.longMathSubtraction(longVal, floatVal);
            LongMath.longMathSubtraction(longVal, charVal);
            LongMath.longMathSubtraction(longVal, byteVal);
            LongMath.longMathSubtraction(longVal, booleanVal);

            LongMath.longMathMultiplication(longVal, longVal);
            LongMath.longMathMultiplication(longVal, shortVal);
            LongMath.longMathMultiplication(longVal, intVal);
            LongMath.longMathMultiplication(longVal, doubleVal);
            LongMath.longMathMultiplication(longVal, floatVal);
            LongMath.longMathMultiplication(longVal, charVal);
            LongMath.longMathMultiplication(longVal, byteVal);
            LongMath.longMathMultiplication(longVal, booleanVal);

            LongMath.longMathDivision(longVal, longVal);
            LongMath.longMathDivision(longVal, shortVal);
            LongMath.longMathDivision(longVal, intVal);
            LongMath.longMathDivision(longVal, doubleVal);
            LongMath.longMathDivision(longVal, floatVal);
            LongMath.longMathDivision(longVal, charVal);
            LongMath.longMathDivision(longVal, byteVal);
            LongMath.longMathDivision(longVal, booleanVal);
        } else if (type.equals("float")) {
            FloatMath.floatMathInt(floatVal, floatVal);
            FloatMath.floatMathInt(floatVal, intVal);
            FloatMath.floatMathInt(floatVal, shortVal);
            FloatMath.floatMathInt(floatVal, doubleVal);
            FloatMath.floatMathInt(floatVal, longVal);
            FloatMath.floatMathInt(floatVal, charVal);
            FloatMath.floatMathInt(floatVal, byteVal);
            FloatMath.floatMathInt(floatVal, booleanVal);

            FloatMath.floatMathSubtraction(floatVal, floatVal);
            FloatMath.floatMathSubtraction(floatVal, shortVal);
            FloatMath.floatMathSubtraction(floatVal, intVal);
            FloatMath.floatMathSubtraction(floatVal, doubleVal);
            FloatMath.floatMathSubtraction(floatVal, longVal);
            FloatMath.floatMathSubtraction(floatVal, charVal);
            FloatMath.floatMathSubtraction(floatVal, byteVal);
            FloatMath.floatMathSubtraction(floatVal, booleanVal);

            FloatMath.floatMathMultiplication(floatVal, floatVal);
            FloatMath.floatMathMultiplication(floatVal, shortVal);
            FloatMath.floatMathMultiplication(floatVal, intVal);
            FloatMath.floatMathMultiplication(floatVal, doubleVal);
            FloatMath.floatMathMultiplication(floatVal, longVal);
            FloatMath.floatMathMultiplication(floatVal, charVal);
            FloatMath.floatMathMultiplication(floatVal, byteVal);
            FloatMath.floatMathMultiplication(floatVal, booleanVal);

            FloatMath.floatMathDivision(floatVal, floatVal);
            FloatMath.floatMathDivision(floatVal, shortVal);
            FloatMath.floatMathDivision(floatVal, intVal);
            FloatMath.floatMathDivision(floatVal, doubleVal);
            FloatMath.floatMathDivision(floatVal, longVal);
            FloatMath.floatMathDivision(floatVal, charVal);
            FloatMath.floatMathDivision(floatVal, byteVal);
            FloatMath.floatMathDivision(floatVal, booleanVal);
        } else if (type.equals("double")) {
            DoubleMath.doubleMathSum(doubleVal, doubleVal);
            DoubleMath.doubleMathSum(doubleVal, intVal);
            DoubleMath.doubleMathSum(doubleVal, shortVal);
            DoubleMath.doubleMathSum(doubleVal, floatVal);
            DoubleMath.doubleMathSum(doubleVal, longVal);
            DoubleMath.doubleMathSum(doubleVal, charVal);
            DoubleMath.doubleMathSum(doubleVal, byteVal);
            DoubleMath.doubleMathSum(doubleVal, booleanVal);

            DoubleMath.doubleMathSubtraction(doubleVal, doubleVal);
            DoubleMath.doubleMathSubtraction(doubleVal, shortVal);
            DoubleMath.doubleMathSubtraction(doubleVal, intVal);
            DoubleMath.doubleMathSubtraction(doubleVal, floatVal);
            DoubleMath.doubleMathSubtraction(doubleVal, longVal);
            DoubleMath.doubleMathSubtraction(doubleVal, charVal);
            DoubleMath.doubleMathSubtraction(doubleVal, byteVal);
            DoubleMath.doubleMathSubtraction(doubleVal, booleanVal);

            DoubleMath.doubleMathMultiplication(doubleVal, doubleVal);
            DoubleMath.doubleMathMultiplication(doubleVal, shortVal);
            DoubleMath.doubleMathMultiplication(doubleVal, intVal);
            DoubleMath.doubleMathMultiplication(doubleVal, floatVal);
            DoubleMath.doubleMathMultiplication(doubleVal, longVal);
            DoubleMath.doubleMathMultiplication(doubleVal, charVal);
            DoubleMath.doubleMathMultiplication(doubleVal, byteVal);
            DoubleMath.doubleMathMultiplication(doubleVal, booleanVal);

            DoubleMath.doubleMathDivision(doubleVal, doubleVal);
            DoubleMath.doubleMathDivision(doubleVal, shortVal);
            DoubleMath.doubleMathDivision(doubleVal, intVal);
            DoubleMath.doubleMathDivision(doubleVal, floatVal);
            DoubleMath.doubleMathDivision(doubleVal, longVal);
            DoubleMath.doubleMathDivision(doubleVal, charVal);
            DoubleMath.doubleMathDivision(doubleVal, byteVal);
            DoubleMath.doubleMathDivision(doubleVal, booleanVal);
        } else if (type.equals("boolean")) {
            BooleanMath.booleanMathSum(booleanVal, booleanVal);
            BooleanMath.booleanMathSum(booleanVal, intVal);
            BooleanMath.booleanMathSum(booleanVal, shortVal);
            BooleanMath.booleanMathSum(booleanVal, floatVal);
            BooleanMath.booleanMathSum(booleanVal, longVal);
            BooleanMath.booleanMathSum(booleanVal, charVal);
            BooleanMath.booleanMathSum(booleanVal, byteVal);
            BooleanMath.booleanMathSum(booleanVal, doubleVal);

            BooleanMath.booleanMathSubtraction(booleanVal, booleanVal);
            BooleanMath.booleanMathSubtraction(booleanVal, shortVal);
            BooleanMath.booleanMathSubtraction(booleanVal, intVal);
            BooleanMath.booleanMathSubtraction(booleanVal, floatVal);
            BooleanMath.booleanMathSubtraction(booleanVal, longVal);
            BooleanMath.booleanMathSubtraction(booleanVal, byteVal);
            BooleanMath.booleanMathSubtraction(booleanVal, doubleVal);
            BooleanMath.booleanMathSubtraction(booleanVal, charVal);

            BooleanMath.booleanMathMultiplication(booleanVal, booleanVal);
            BooleanMath.booleanMathMultiplication(booleanVal, shortVal);
            BooleanMath.booleanMathMultiplication(booleanVal, intVal);
            BooleanMath.booleanMathMultiplication(booleanVal, floatVal);
            BooleanMath.booleanMathMultiplication(booleanVal, longVal);
            BooleanMath.booleanMathMultiplication(booleanVal, byteVal);
            BooleanMath.booleanMathMultiplication(booleanVal, doubleVal);
            BooleanMath.booleanMathMultiplication(booleanVal, charVal);

            BooleanMath.booleanMathDivision(booleanVal, booleanVal);
            BooleanMath.booleanMathDivision(booleanVal, shortVal);
            BooleanMath.booleanMathDivision(booleanVal, intVal);
            BooleanMath.booleanMathDivision(booleanVal, floatVal);
            BooleanMath.booleanMathDivision(booleanVal, longVal);
            BooleanMath.booleanMathDivision(booleanVal, byteVal);
            BooleanMath.booleanMathDivision(booleanVal, doubleVal);
            BooleanMath.booleanMathDivision(booleanVal, charVal);
        } else System.out.println("Не удалось распознать ввод. Конец программы.");
    }

//    public
}
