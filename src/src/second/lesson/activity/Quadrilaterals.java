/**
 * Author: Carlos Melo
 */

package second.lesson.activity;

public class Quadrilaterals {
    protected static void area(double length, double width){
        System.out.println(length * width);
    }
    protected static void area(double bottomBase, double upperBase, double height){
        System.out.println(0.5 * (bottomBase+upperBase) * height);
    }
    protected static void area(double width){
        System.out.println(width * width);
    }
}
