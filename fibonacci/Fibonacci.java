public class Fibonacci{
	
	static void fib(int N,long[] ans){
		int current = 0, pre = 1;
		for (int i = 0; i < N; i++){
			ans[i] = current; 
			current += pre;
			pre = current - pre;
		}
	}
}