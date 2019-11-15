import java.util.Scanner;
//main class for question 3
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        //gets value from user input
        System.out.println("Please enter a non-ngative integer above 0 and each digit will be printed out with spaces: ");
        x = input.nextInt();
        newInt(x);
    } 
    //prints the value with spaces
    public static void newInt(int x) {
        int j = x, length = 0;    
        while (j > 0) {
            length++;
            j /= 10;
        } 
        //sets length as an array
        int[] intArray = new int[length];
        for(int i = length - 1; i >= 0; i--) {
            intArray[i] = x % 10;
            x /= 10;
        }
        for(int i = 0; i < length; i++) {
            System.out.print(intArray[i] + "\t");
        }
        System.out.println("");
    }
}