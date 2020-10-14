import java.math.*;
import java.util.Scanner;

public class mod_inverse_func {

   public static void main(String[] args) {

      BigInteger biginteger1, biginteger2, result;

      // Initialize all BigInteger Objects
      biginteger1 = new BigInteger("8");
      biginteger2 = new BigInteger("21");

      // perform modInverse operation on biginteger1 using biginteger2.
      result = biginteger1.modInverse(biginteger2);

      String expression = biginteger1 + " ^ -1 % "+ biginteger2 + " = " + result;

      // print result value
      System.out.println(expression);
   }
}
