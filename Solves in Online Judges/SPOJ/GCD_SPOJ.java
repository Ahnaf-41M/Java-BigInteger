
import java.util.*;
import java.math.BigInteger;

class GCD_SPOJ {
	public static void main (String[] args) throws java.lang.Exception {
		
		Scanner in = new Scanner(System.in);
		BigInteger a, b;
		int t;

		t = in.nextInt();

		while (t-- > 0) {
			a = in.nextBigInteger();
			b = in.nextBigInteger();
			System.out.println(a.multiply(b));
		}
		//in.colsed();
	}
}