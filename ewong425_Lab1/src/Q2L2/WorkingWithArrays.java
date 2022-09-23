package Q2L2;
import java.util.Scanner;
public class WorkingWithArrays {
    public static void main(String[] args) {
        int arraySize; int val;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an array size: ");
        arraySize = sc.nextInt();
        int [] userInput = new int[arraySize];
        for(int i=0; i<arraySize; i++) {
            System.out.println("Please enter a first value");
            val = sc.nextInt();
            userInput[i] = val;
        }
        mma5MethodEthan(userInput);
    }
    public static double[] mma5MethodEthan(int[] input) {
        int count = 0; int min = 0; int max = 0; int avg = 0; int prev = 0; int total = 0;
        double[] arr = new double[4];
        for(int i=0; i<input.length; i++) {
            if(input[i]%5 == 0) {
                prev = input[i];
                total += input[i];
                max = Math.max(prev, max);
                if(min == 0) {
                    min = prev;
                } else {
                    min = Math.min(min, prev);
                }
                count++;
            }
        }
        if(count == 0) {
            avg = 0;
        } else {
            avg = total/count;
        }
        arr[0] = max;
        arr[1] = min;
        arr[2] = avg;
        arr[3] = 251205049;
        if(count > 0) {
            System.out.println("Ethan found " + count + " numbers divisble-by-5");
        } else {
            System.out.println("In the array, there was no number divisble by 5");
        }
        return arr;
    }
    public static void header(int n) {
        System.out.println("Lab Exercise: " + n + "-Q2");
        System.out.println("Prepared by: Ethan Wong");
        System.out.println("Student Number: 251205049");
        System.out.println("Goal: Working with arrays and conditionals\n");
        System.out.println("=============================================");
    }
    public static void footer(int n) {
        int lab = n;
        System.out.println("=============================================");
        System.out.println("Completion of Lab Exercise " + n + " is successful!");
        System.out.println("Signing off -Ethan ");
    }
}
