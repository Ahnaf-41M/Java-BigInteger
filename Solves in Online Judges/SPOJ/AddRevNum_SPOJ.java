import java.math.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class AddRevNum_SPOJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigInteger b, n1, m1, sum, n, m, md, zero = BigInteger.valueOf(0);
		int t;

		t = in.nextInt();

		while (t-- > 0) {
			n1 = BigInteger.valueOf(0);
			m1 = BigInteger.valueOf(0);
			n = in.nextBigInteger();
			m = in.nextBigInteger();
			md = BigInteger.valueOf(10);
			while (true) {
				n1 = (n.mod(md)).add(n1.multiply(md));
				n = n.divide(md);
				if (n.compareTo(zero) == 0)
					break;
			}
			while (true) {
				m1 = (m.mod(md)).add(m1.multiply(md));
				m = m.divide(md);
				if (m.compareTo(zero) == 0)
					break;
			}
			sum = m1.add(n1);
			n1 = BigInteger.valueOf(0);
			while (true) {
				n1 = (sum.mod(md)).add(n1.multiply(md));
				sum = sum.divide(md);
				if (sum.compareTo(zero) == 0)
					break;
			}
			System.out.println(n1);
		}

	}

}
