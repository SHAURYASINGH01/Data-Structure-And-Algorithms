class Solution {
    int majorityElement(int arr[]) {
        int freq = 0, ans = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            
            if(freq == 0){
                
                ans = arr[i]; //Current Element
                freq=1;
                
            } else if(arr[i] == ans){
                freq ++;
                
            }else{
                
                freq --;
            }
        }
            //Check if count of arr[i] is more
            // than half the size of the array
            int count = 0;
            for(int val : arr){   //If no any majority element
                if(val == ans) count++;
            }
            
            if(count > n/2){
                return ans;
            }
            return -1;
    }
}