//Taking Input From User Arranged the Number in Sorted Array.
//Problem 2:
import java.util.*;
public class SortedArray {
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int Number[] = new int[size];
    for(int i=0; i<size; i++){
      Number[i] = sc.nextInt();
    }
    boolean is_sorted = true;
    for(int i=0; i<Number.length-1; i++){
      if(Number[i]> Number[i+1]){
        is_sorted = false;
      }
    }
    if(is_sorted) {
      System.out.println("Array is Sorted");
    }else{
      System.out.println("Array is not Sorted");
    }
    sc.close();
  }
}
