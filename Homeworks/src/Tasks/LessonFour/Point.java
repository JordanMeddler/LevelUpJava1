package Tasks.LessonFour;

public class Point {
    private int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int quadrant(){
        if (this.x > 0 & this.y > 0){
            return 1;
        } else if (this.x < 0 & this.y > 0) {
            return 2;
        } else if (this.x < 0 & this.y < 0){
            return 3;
        } else if (this.x > 0 & this.y < 0){
            return 4;
        } else return 0;
    }

    Point flip() {
        Point pointFlip = new Point(y, x);
        return pointFlip;
    }
}
