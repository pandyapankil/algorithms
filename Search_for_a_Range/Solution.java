public class Solution {
    static int binarySearch(int[] arr, int key, boolean searchFirst){
        int lo = 0, hi = arr.length - 1, id = -1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == key){
                id = mid;
                if(searchFirst)
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
            else if(arr[mid] > key)
                hi = mid - 1;
            else// if(arr[mid] < key)
                lo = mid + 1;
        }
        return id;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target, true);
        int last =  binarySearch(nums, target, false);
        int[] res = new int[2];
        res[0] = first;
        res[1] = last;
        return res;
    }
}