public class Solution {
    static int binarySearch(int[] arr){
        int lo = 0, hi = arr.length - 1;
        if(arr[lo] <= arr[hi])
            return -1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] > arr[mid+1])   
                return mid+1;
            if(arr[lo] <= arr[mid])
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
        
    }
    static int binarySearch(int[] arr, int lo, int hi, int key){
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == key)
                return mid;
            if(key < arr[mid])
                hi = mid-1;
            else
                lo = mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int mid = binarySearch(nums);
        if(mid == -1)
            return binarySearch(nums, 0, nums.length-1, target);
        int first = binarySearch(nums, 0, mid-1, target);
        if(first != -1)
            return first;
        return binarySearch(nums, mid, nums.length-1, target);
    }
}