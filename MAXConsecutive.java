class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int j = 0;
        for(int i=0;i<n;i++) {
            if(nums[i] != 0) {
                res[j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
        
    }
}

