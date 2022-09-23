package Q1L1;
import java.util.Scanner;
public class TestingExecutionTime {
    public static void main(String[] args) {
        //declare variables
        double result = 1; int i = 1; long timeStart; long timeEnd; double time;
        Scanner sc = new Scanner(System.in);
        header(1);
        System.out.println("Enter a value to calculate the factorial of: \n" );
        int val = sc.nextInt();
        //Check if input is a positive integer
        while(val <= 0) {
            System.out.println("Enter an a positive integer: ");
            val = sc.nextInt();
        }
        //Iterative through main method
        timeStart = System.nanoTime();
        while(i<=val) {
            result = i*result;
            i++;
        }
        timeEnd = System.nanoTime();
        time = timeEnd-timeStart;
        System.out.printf("Result is: %.0e Time taken: %.0f \n", result, time);
        //Iterative method
        timeStart = System.nanoTime();
        result = iterativeFactorial(val);
        timeEnd = System.nanoTime();
        time = timeEnd-timeStart;
        System.out.printf("Result is: %.0e Time taken: %.0f \n", result, time);
        //Recursive method
        timeStart = System.nanoTime();
        result = recursiveFactorial(val);
        timeEnd = System.nanoTime();
        time = timeEnd-timeStart;
        System.out.printf("Result is: %.0e Time taken: %.0f \n", result, time);
        footer(1);
    }
    public static void header(int n) {
        System.out.println("Lab Exercise: " + n + "-Q2");
        System.out.println("Prepared by: Ethan Wong");
        System.out.println("Student Number: 251205049");
        System.out.println("Goal: To observe the time difference of calculating a factorial number either recursively or iteratively\n");
    }
    public static void footer(int n) {
        int lab = n;
        System.out.println("Completion of Lab Exercise " + n + " is successful!");
        System.out.println("Signing off -Ethan ");
    }
    public static double iterativeFactorial(int n) {
        double result = 1;
        int i = 1;
        while(i<=n) {
            result = i*result;
            i++;
        }
        return result;
    }
    public static double recursiveFactorial(int n) {
        if(n==0) {
            return 1;
        } else {
            return n*recursiveFactorial(n-1);
        }
    }
}
