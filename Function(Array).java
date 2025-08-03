//Max,Min Function in Java Taking userinput; 
//Problem 2
import java.util.*;
public class Function {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      int max = Integer.MIN_VALUE;   //-infinity
      int min = Integer.MAX_VALUE;  //+infinity
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
               System.out.println("Largest number is : " + max);
               System.out.println("Smallest number is : " + min);
           }
       }
       sc.close();
   }
}

