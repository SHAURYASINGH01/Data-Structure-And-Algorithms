public class Array{
  public static void printpairs(int num[]){
    for(int i=0;i<num.length;i++){
      int curr=num[i];
      for(int j=0;j<num.length;j++){
        System.out.print("("+ curr + "," + num[j]+")");
      }
      System.out.println();
    } 
  }
}
