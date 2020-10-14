import java.util.Scanner;
import java.math.BigInteger;
//Problem Name:  1024 - Eid 
class Eid_1024_LightOJ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int k = 1; k <= t; k++) {
			int n = sc.nextInt();

			// BigInteger b1 = sc.nextBigInteger();
			BigInteger b2 = sc.nextBigInteger();
			// BigInteger ans = (b1.multiply(b2)).divide(b1.gcd(b2));
			BigInteger ans = b2;

			for (int j = 2; j <= n; j++) {
				BigInteger b1 = sc.nextBigInteger();
				ans = (ans.multiply(b1)).divide(ans.gcd(b1));
			}
			System.out.println("Case " + k + ": " + ans);
			System.gc();
		}


	}
}