public class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum_so_far = 0, max_sum = Integer.MIN_VALUE;;
        
        for(int val : nums){
            max_sum_so_far += val;
            if(max_sum_so_far > max_sum)
                max_sum = max_sum_so_far;
            if(max_sum_so_far < 0)
                max_sum_so_far = 0;
        }
        return max_sum;
    }
}