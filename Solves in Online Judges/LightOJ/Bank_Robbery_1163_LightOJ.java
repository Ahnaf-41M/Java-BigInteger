import java.math.BigInteger;
import java.util.Scanner;
class Bank_Robbery_1163_LightOJ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		for (int k = 1; k <= t; k++) {
			BigInteger b, lob = new BigInteger("9"), hor = new BigInteger("10");
			BigInteger _1 = new BigInteger("1");
			BigInteger _0 = new BigInteger("0");

			b = sc.nextBigInteger();

			if (b.mod(lob).equals(_0)) {
				b = b.multiply(hor);
				b = b.divide(lob);
				System.out.println("Case " + k + ": " + b.subtract(_1) + " " + b);
			} else {
				b = b.multiply(hor);
				b = b.divide(lob);
				System.out.println("Case " + k + ": " + b);
			}
		}

	}
}