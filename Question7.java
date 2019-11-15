import java.util.Scanner;
//main class for question 7  
public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //c is for points inside circle and n is for total number
        double c = 0;
        double n, x, y;
        //getting user input for the total number
        System.out.println("Please enter the number of points: ");
        n  = input.nextDouble();
        //for loop that generates the plot points based on the input
        for (double i = 0; i <= n; i++) {
            x = Math.random();
            y = Math.random();
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) < 1) {
                c++; 
            }
        }
        //estimating the value of pi
        double mathpie = 4 * (c / n);
        System.out.println("The estimation of the value of pi is: " + mathpie);
    }
}