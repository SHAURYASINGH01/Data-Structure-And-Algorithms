import java.util.*;
class linear_Search{
  public static int ls(int num[], int key){
    for(int i=0; i<=num.length; i++){
      if(num[i]==key){
        return i;
      }
    }
    return -1;
  }

  public class LinearSearch {
  }
}