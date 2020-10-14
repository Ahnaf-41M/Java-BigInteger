import java.math.BigInteger;
public class isProbablePrime {
	public static void main(String[] args) {
		
		BigInteger big1;
		Boolean bool1, bool2, bool3;
		big1 = new BigInteger("5");

// perform isProbablePrime on big1  with certainty 1,0,-1
		bool1 = big1.isProbablePrime (1);
		bool2 = big1.isProbablePrime (0);
		bool3 = big1.isProbablePrime (-1);

		String str1 = big1 + " is prime with certainty 1 is " + bool1;
		String str2 = big1 + " is prime with certainty 0 is " + bool2;
		String str3 = big1 + " is prime with certainty -1 is " + bool3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
