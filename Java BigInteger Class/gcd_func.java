import java.math.BigInteger;
public class gcd_func {
	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("12");
		BigInteger b2 = new BigInteger("10");

		BigInteger  bigVal = b1.gcd(b2);
		String str = "GCD of " + b1 + " and " + b2 +  " is " + bigVal;
		System.out.println(str);
	}
}
