public class Fibonacci{
	
	static void fib(int N,long[] ans){
		int current = 0, pre = 1;
		for (int i = 0; i < N; i++){//0 1 2
			ans[i] = current;     //0 1 1 2 3
			current += pre;       //1 1 2 3 
			pre = current - pre;  //0 1 1 2
		}
	}
}