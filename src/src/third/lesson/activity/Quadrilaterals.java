/**
 * Author: Carlos Melo
 */

package third.lesson.activity;

public class Quadrilaterals {
    protected static double area(double length, double width){
        return length * width;
    }
    protected static double area(double bottomBase, double upperBase, double height){
        return 0.5 * (bottomBase+upperBase) * height;
    }
    protected static double area(double width){
        return width * width;
    }
}
