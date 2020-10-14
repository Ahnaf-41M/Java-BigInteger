import java.math.*;
public class abs_func {

	public static void main(String[] args) {

		BigInteger b = new BigInteger("-2300");

		// abs() method on bigInteger to find the absolute value of a BigInteger
		BigInteger absolutevalue = b.abs();

		// Define result
		String result = "BigInteger : " + b +" and Absolute value is " + absolutevalue;
		System.out.println(result);
	}
}
