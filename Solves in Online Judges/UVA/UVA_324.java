
import java.util.Scanner;
import java.math.*;

public class UVA_324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		BigInteger fact, rem, i1, md = BigInteger.valueOf(10);
		int n, i;

		while (in.hasNext()) {
			int a[] = new int[10];
			n = in.nextInt();
			fact = BigInteger.valueOf(1);
			BigInteger zero = BigInteger.valueOf(0);
			for (i = 1; i <= n; i++) {
				i1 = BigInteger.valueOf(i);
				fact = fact.multiply(i1);
			}
			while (true) {
				i1 = fact.mod(md);
				i = i1.intValue();
				a[i]++;
				fact = fact.divide(md);
				if (fact.equals(zero))
					break;

			}
			System.out.println(n + "! --");
			System.out.println("(0)   " + a[0] + "   (1)   " + a[1] + "   (2)   " + a[2] + "   (3)   " + a[3]
			                   + "   (4)   " + a[4]);
			System.out.println("(5)   " + a[5] + "   (6)   " + a[6] + "   (7)   " + a[7] + "   (8)   " + a[8]
			                   + "   (9)   " + a[9]);
		}

	}

}
