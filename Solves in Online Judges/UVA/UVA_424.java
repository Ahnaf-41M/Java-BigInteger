import java.util.Scanner;
import java.math.BigInteger;
public class UVA_424 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		BigInteger b1, b2 = BigInteger.valueOf(0), zero = BigInteger.valueOf(0);

		while (in.hasNextBigInteger()) {
			b1 = in.nextBigInteger();
			b2 = b2.add(b1);
			if (b1.equals(zero))
				break;
		}
		System.out.println(b2);
		in.close();

	}

}
