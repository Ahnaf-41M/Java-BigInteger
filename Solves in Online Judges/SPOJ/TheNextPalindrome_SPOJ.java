import java.util.Scanner;
import java.math.*;
import java.math.BigInteger;

public class TheNextPalindrome_SPOJ {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      BigInteger fact = BigInteger.ONE;
      int t, n;

      t = in.nextInt();
      while (t-- > 0) {
         n = in.nextInt();
         fact = BigInteger.valueOf(1);
         for (int i = 2; i <= n; i++) {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
         }
         System.out.println(fact);

      }

   }

}
