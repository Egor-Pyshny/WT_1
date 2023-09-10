package task2;

public class Area {
    public static boolean internalPoint(double x, double y)  {
        return inRectangle(x,y) && !outOfShape(x,y);
    }
    protected static boolean inRectangle(double x, double y) {
        return (y>=-3 && y<=5) && Math.abs(x)<=6;
    }

    protected static boolean outOfShape(double x, double y) {
        return y>0 && Math.abs(x)>4;
    }
}
