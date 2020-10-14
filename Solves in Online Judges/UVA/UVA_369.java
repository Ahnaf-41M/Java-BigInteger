import java.util.Scanner;
import java.math.BigInteger;

public class UVA_369 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		BigInteger b = BigInteger.valueOf(1), fact[] = new BigInteger[205];
		int n, m, i;
		fact[0] = BigInteger.valueOf(1);
		for (i = 1; i <= 200; i++) {
			b = b.multiply(BigInteger.valueOf(i));
			fact[i] = b;
		}
		while (in.hasNext()) {

			n = in.nextInt();
			m = in.nextInt();
			if (n == 0 && m == 0)
				break;
			System.out.print(n + " things taken " + m + " at a time is ");
			System.out.println((fact[n]).divide(fact[n - m].multiply(fact[m])) + " exactly.");
		}
		in.close();

	}

}
