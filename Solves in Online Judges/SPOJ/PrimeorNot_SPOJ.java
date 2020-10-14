import java.math.*;
import java.util.Scanner;
public class PrimeorNot_SPOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigInteger n;
		int t;
		boolean f = true;


		t = in.nextInt();

		while (t-- > 0) {
			n = in.nextBigInteger();
			f = n.isProbablePrime(1);
			if (f)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

}
