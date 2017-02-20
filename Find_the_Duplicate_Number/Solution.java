public class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0, i = 0;
        
        // below commented code is required when input is from 0 to n and not 1 to n.
        /*for(i=0; i<nums.length; i++)
            if(nums[i] != i){
                fast = slow = i;
                break;
            }
        if(fast == -1)
            return -1;*/
            
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast != slow);
        
        slow = i;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return fast;
    }
}