import java.util.Scanner;
import java.math.BigInteger;
public class UVA_10929 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigInteger n, n1, eleven = BigInteger.valueOf(11), zero = BigInteger.valueOf(0);
		String s;

		while (in.hasNext()) {
			s = in.next();
			n = new BigInteger(s);
			if (n.equals(zero))
				break;
			n1 = n.mod(eleven);
			if (n1.equals(zero))
				System.out.println(s + " is a multiple of 11.");
			else
				System.out.println(s + " is not a multiple of 11.");
		}

	}

}
