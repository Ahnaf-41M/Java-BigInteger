import java.math.*;
import java.util.Scanner;
public class mod_pow_func {
   public static void main(String[] args) {
      BigInteger biginteger1, biginteger2, result;

      biginteger1 = new BigInteger("23895");
      biginteger2 = new BigInteger("14189");
      BigInteger exponent = new BigInteger("15");

      // Perform modPow operation on the objects and exponent
      result = biginteger1.modPow(exponent, biginteger2);
      String expression = biginteger1 + "^" + exponent + " % "+ biginteger2 + " = " + result;

      System.out.println(expression);
   }
}
