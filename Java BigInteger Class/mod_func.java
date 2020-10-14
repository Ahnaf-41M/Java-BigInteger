import java.math.BigInteger;
public class mod_func {
	public static void main(String[] args) {
		// Creating 2 BigInteger objects
		BigInteger b1, b2;

		b1 = new BigInteger("321456");
		b2 = new BigInteger("31711");

		// apply mod() method
		BigInteger result = b1.mod(b2);

		// print result
		System.out.println( b1+ " % " + b2 +" is equal to: " + result);
	}
}
