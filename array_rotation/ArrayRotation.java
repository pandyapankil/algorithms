import java.util.*;

public class ArrayRotation{	
	static void reverse(int[] arr, int left, int right){
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	static void rotate(int[] arr, int rotate){
		int n = arr.length;
		reverse(arr, n - rotate, n - 1);
		reverse(arr, 0, n - rotate - 1);
		reverse(arr, 0, n - 1);		
	}	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		rotate(a, 2);	
		System.out.println(Arrays.toString(a));
	}
}