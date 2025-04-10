import java.util.Scanner;
import java.util.Arrays;

public class Reverse_Array {
    public static void reverseArray(int[] arr) { 
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start]; 
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        sc.close();
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
