import java.util.Scanner;
import java.math.BigInteger;
public class BISHOPs_SPOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger b1, two = BigInteger.valueOf(2), one = BigInteger.valueOf(1);
		Scanner in = new Scanner(System.in);

		while (in.hasNextBigInteger()) {
			b1 = in.nextBigInteger();
			if (b1.equals(one))
				System.out.println(1);
			else {
				b1 = two.multiply(b1.subtract(one));
				System.out.println(b1);
			}

		}
		in.close();

	}

}
