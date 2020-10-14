import java.util.Scanner;
import java.math.BigInteger;

public class UVA_10106 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		BigInteger b1, b2;

		while (in.hasNextBigInteger()) {
			b1 = in.nextBigInteger();
			b2 = in.nextBigInteger();
			System.out.println(b1.multiply(b2));
		}
		in.close();
	}

}
