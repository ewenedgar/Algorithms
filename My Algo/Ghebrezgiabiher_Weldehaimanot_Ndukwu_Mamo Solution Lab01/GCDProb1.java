package algorithm.lab01;

public class GCDProb1 {

	public static void main(String[] args) {
		
		System.out.println(GCDProb1.getGCD(8, 4));
	}

	public static int getGCD(int m, int n) {
		
		int smaller = m > n ? n: m;
		int gcd = 1;
		for (int i =2; i <= smaller; i ++){
			if ( m % i == 0 && n % i == 0){
				gcd = i;
			}
		}
		return gcd;
	}
	
}
