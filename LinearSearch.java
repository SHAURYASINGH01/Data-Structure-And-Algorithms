import java.util.*;
public class linearSearchArray{
  public static int ls(int num[], int key){
    for(int i=0; i<=num.length; i++){
      if(num[i]==key){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[]args){
    int num[] = {2,51,24,44};
    int key = 24;
    int indx = ls(num,key);
    if(indx == -1){
      System.out.println("Not found");
    } else {
      System.out.println("Key is found at: "+indx);
    }
  }
}
