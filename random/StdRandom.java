import java.util.Random;

public class StdRandom{

	private static long seed;
	private static Random random;
	
	static{
		seed = System.currentTimeMillis();
		random = new Random(seed);
	}
	
	static int random(int n){
		return random.nextInt(n);
	}
	
	static int random(int lo,int hi){
		return lo + random(hi - lo);
	}
	
	static double random(double n){
		return random.nextDouble() * n;
	}
	
	static double random(double lo, double hi){
		return lo + random(hi - lo);
	}
}