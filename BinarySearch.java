public class Array {
  public static int binarysearch(int num[],int key){
  int start=0; int end=num.length-1; 
  while(start<=end){
    int mid=(start+end)/2;
    //comparision
    if(num[mid]==key){
      return mid; 
    }
    if(num[mid]<key){
      start=mid+1;
    }else{
      end=mid-1;   
    }
  }
  return -1;
}
