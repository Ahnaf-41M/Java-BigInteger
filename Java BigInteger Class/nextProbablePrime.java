import java.math.BigInteger;
public class nextProbablePrime {
	public static void main(String[] args) {

		BigInteger b1, b2, b3, b4;

		b1 = new BigInteger("10");
		b2 = new BigInteger("23");

// assign nextProbablevalue of  b1,b2 to b3,b4
		b3 = b1.nextProbablePrime();
		b4 = b2.nextProbablePrime();
		
		String str1 = " Next Probable prime after " + b1 + " is " + b3;
		String str2 = " Next Probable prime after " + b2 + " is " + b4;
		System.out.println(str1);
		System.out.println(str2);

	}
}
