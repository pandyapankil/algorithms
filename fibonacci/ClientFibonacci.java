public class ClientFibonacci{
	public static void main(String[] args){
		long[] a = new long[40];
		Fibonacci.fib(a.length,a);
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}
}
