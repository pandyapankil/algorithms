import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementMap = new HashMap<Integer, Integer>();
        int i=0;
        
        for(int no : nums){
            if(complementMap.containsKey(no)){
                int[] ans = new int[2];
                ans[0] = complementMap.get(no);
                ans[1] = i;
                return ans;
            }
            complementMap.put(target-no, i++);
        }
        
        return new int[2];
    }
}