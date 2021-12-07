/*
 Write a Java program to print the area and perimeter of a circle. Go to the editor
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

public class Area {
    public static void main (String[] args)
    {
        double rad = 7.5, perimeter, area;


            area = 3.14 * rad * rad;
            perimeter=2* 3.14 *rad;
            System.out.println("area is " + area );
            System.out.println("perimeter is " + perimeter);

    }
}

