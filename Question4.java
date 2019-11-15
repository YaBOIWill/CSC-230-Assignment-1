import java.util.Scanner;
//main class for question 4
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //gets three values as input
        System.out.println("Please enter a value for a: ");
        double a = input.nextDouble();
        System.out.println("Please enter a value for b: ");
        double b = input.nextDouble();
        System.out.println("Please enter a value for c: ");
        double c = input.nextDouble();
        double[] rootsarray = getRoots(a, b, c);
        //displays the roots and whether or not they are real
        if (rootsarray[0] < 0 || rootsarray[1] < 0) {
           System.out.println("These roots are less than 0 and therefore not real.");
       } else if (rootsarray[0] == 0 || rootsarray[1] == 0) {
           System.out.println("The discriminate is 0 and therefore there is only one real root: " + (rootsarray[0] + rootsarray[1]));
       } else {
           System.out.println("The discriminate is a real number that is not 0. Therefore there are two real roots. "
                   + "The first root is: " + rootsarray[0]);
           System.out.println("The second root is: " + rootsarray[1]);
       }
    }  
    //method to obtain the roots 
    public static double[] getRoots(double a, double b, double c) {
        //quadratic equation to get the roots
        double r1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a );
        double r2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a );
        double[] roots = {r1, r2}; 
        return roots;
    }
}