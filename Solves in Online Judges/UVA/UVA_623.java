import java.util.Scanner;
import java.math.*;

public class UVA_623 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		BigInteger fact, i1;
		int i, n;

		while (in.hasNext()) {
			n = in.nextInt();
			//System.out.print(s[1]);
			//n = Integer.parseInt(s);
			fact = BigInteger.valueOf(1);
			for (i = 1; i <= n; i++) {
				i1 = BigInteger.valueOf(i);
				fact = fact.multiply(i1);
			}
			System.out.println(n + "!");
			System.out.println(fact);
		}

	}

}
