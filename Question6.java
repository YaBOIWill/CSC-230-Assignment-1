import java.util.Scanner;
//main class for question 6
public class Question6 {
static double g = 0.001;
//method to get the area at x 
public static double CircleArea(double x, int rad) {
    //locate y at the selected x coordinate
    double y1 = Math.sqrt((double)(rad * rad - (x * x)));
    double ca = y1 * g;
    //returning the circle area
    return ca;
}
//the main method
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //prompt the user to enter the value for the radius
    System.out.println("Please enter the radius as a postive integer: ");
    int rad = input.nextInt();
    double area = 0;
    //loop to find the area using the radius, then adding the rectangles together
    for (double x = -rad; x <= rad; x += g) {
        area += CircleArea(x, rad);
    }
    //doubling the area for the small circle to get the real area
    area *= 2;
    //printing the approximate area
    System.out.println("The approximate area of the circle is: " + area);
    //printing the exact area
    System.out.println("The exact area of the circle is: " + Math.PI * (Math.pow(rad, 2)));
    }
}