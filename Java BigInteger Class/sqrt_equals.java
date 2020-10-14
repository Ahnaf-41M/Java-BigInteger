import java.math.*;
public class sqrt_equals {
	public static void main(String[] args) {
		BigInteger b1, squareRoot,b2;

		b1 = new BigInteger("31739");
		b2 = new BigInteger("31739");

		boolean is_equal = b1.equals(b2);

		squareRoot = b1.sqrt();//supports in jdk 9 or Java SE 9

		System.out.println("Square root of " + b1+ " is " + squareRoot);
		if(is_equal)
			System.out.println("Equal!");
		else
			System.out.println("Not equal.");

	}
}