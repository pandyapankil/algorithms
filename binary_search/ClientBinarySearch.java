import java.util.Arrays;

public class ClientBinarySearch{
	
	public static void main(String[] args){
		
		int[] a = {1,2,6,9,10,15};
		Arrays.sort(a);
		System.out.println(BinarySearch.rank(10,a));
	}
}
