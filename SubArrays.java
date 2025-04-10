public class SubArrays {
    public static void PrintSubArray(int nums[]) {
       for (int i = 0; i<nums.length; i++) {
            for (int j = i; j<nums.length; j++) {
                int start = i; int End = j;
                for (int k = start; k<= End; k++) {
                    System.out.print(nums[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        PrintSubArray(nums);
    }
}
