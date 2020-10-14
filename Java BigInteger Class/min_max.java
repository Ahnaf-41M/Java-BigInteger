import java.math.*;
public class min_max {

	public static void main(String[] args) {

		// Create 2 BigInteger objects
		BigInteger biginteger = new BigInteger("8976543245");
		BigInteger val = new BigInteger("9248040402");

		// Call max() method to find greater value between two BigIntegers.
		BigInteger biggerInteger = biginteger.max(val);

		String result = "Bigger Integer between " + biginteger + " and "
		                + val + " is " + biggerInteger;

		// Prints the result
		System.out.println(result);
	}
}
