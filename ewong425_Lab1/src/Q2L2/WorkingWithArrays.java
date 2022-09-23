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
        int count = 0; double[] arr = new double[input.length];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<input.length; i++) {
            for(int k=0; k<input.length; k++) {
                if(input[i]%5==0) {
                    arr[k] = input[i];
                }
            }
        }
    }
}
