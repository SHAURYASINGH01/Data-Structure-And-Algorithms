// Find the Position of X value in java by taking userinput.
//2D Array Problem 1:
import java.util.*;
public class Arrays {
int x;
public static void main(String []args) {
  Scanner sc = new Scanner(System.in);
  int rows = sc.nextInt();
  int columns = sc.nextInt();
  int numbers[][]= new int[rows][columns];
  for(int i=0; i<rows; i++) {
    for(int j=0; j<columns; j++) {
      numbers[i][j]= sc.nextInt();
    }
  }
  int x = sc.nextInt();  
  for(int i=0; i<rows; i++) {
      for(int j=0; j<columns;j++) {
          if(numbers[i][j] == x) {
          System.out.println("number found at index: " + i +","+ j + "");
        }
      }
    }
  sc.close();
  }
}
