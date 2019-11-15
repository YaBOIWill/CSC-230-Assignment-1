import java.util.Scanner;
//main class for question 2
public class Question2 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get variables from user
        System.out.println("Please enter three numbers, separated by spaces: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        //displays the value of the function
        System.out.println("The value of the function with the numbers entered is: " + FunctionF(x, y, z));
    }
    //method that executes the function with the values entered
    public static double FunctionF(double x, double y, double z) {
        double f = (1 / (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) - 16)));
        return f;
    }
}