//question 5 for programming assignment 1
public class Question5 {
    public static void main(String[] args) {
        //value n 
        int n = 1000;
	//nested for loops to find the possible pairs of integers
        for (int a = 1; a < n - 1; a++) {
            for (int b = a + 1; b < n; b++) {
                if ( (a*a + b*b + 1) % (a*b) == 0) {
                    System.out.println("(" + a + ", " + b + ")");
                }
            }
        }
    }
} 