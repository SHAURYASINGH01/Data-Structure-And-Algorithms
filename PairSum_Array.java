public class Array{
  public static void printpairs(int num[]){
    int tp=0;
    for(int i=0;i<num.length;i++){
      int curr=num[i];
      for(int j=i+1;j<num.length;j++){
        System.out.println("("+ curr + ","+num[j]+")");
         tp++;
      }
      System.out.print();
    }
    System.out.println("total pairs: "+tp);
  }
  
public static void main(String []args){
  num[] = {2,4,6,8,10};
  printpairs(num);
  }
}



// O/P
((2,4) (2,6) (2,8) (2,10) //4
((4,6) (4,8) (4,10))   //3
((6,8) (6,10))     //2
(8,10))          //1
{tp = 10}
