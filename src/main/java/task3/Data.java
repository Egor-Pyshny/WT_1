package task3;

import java.util.ArrayList;

public class Data {
    public double x;
    public double value;

    public Data(double x, double value) {
        this.x = x;
        this.value = value;
    }

    public static void print(ArrayList<Data> dataPoints){
        System.out.println("x\tF(x)");
        for (Data point : dataPoints) {
            System.out.format(" %.14f | %.14f \n", point.x, point.value);
        }
    }
}
