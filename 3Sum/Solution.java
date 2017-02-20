public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int N = nums.length;
        
        Arrays.sort(nums);
        
        for(int i=0; i<N-2; i++){
            if(i == 0 || nums[i] > nums[i-1]){
                int lo = i+1, hi = N-1;
                while(lo < hi){
                    int sum = nums[i] + nums[lo] + nums[hi];
                    if(sum == 0)
                        result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    if(sum < 0){
                        int currentLo = lo;
                        while(nums[currentLo] == nums[lo] && lo < hi)
                            lo++;
                    }
                    else{
                        int currentHi = hi;
                        while(nums[currentHi] == nums[hi] && lo < hi)
                            hi--;
                    }
                }
            }
        }
        
        return result;
    }
}