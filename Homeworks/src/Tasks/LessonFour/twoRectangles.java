package Tasks.LessonFour;

public class twoRectangles {
    public static void coordinates(int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((y1 > y2 || y0 < y3) && (x1 > x2 || x3 > x0)){
            System.out.println("Прямоугольники не пересекаются.");
        } else System.out.println("Прямоугольники пересекаются или расположены одинаково.");
    }
}
