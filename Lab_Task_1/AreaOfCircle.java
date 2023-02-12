/* 4. Find the area of a Circle. [Print 2 digits after decimal point]. */
package Lab_Task_1;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double Pi_Value = 3.14159; // Final is a non Accessable Modifier
        double radius = 2.5;
        double Area = Pi_Value * radius * radius;

        System.out.printf("Area of Circle : %.2f\n", Area);

        // System.out.format("Area of Circle : %.2f", Area); // Another Way
    }
}
