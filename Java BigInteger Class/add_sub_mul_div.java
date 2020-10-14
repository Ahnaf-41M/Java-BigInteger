import java.math.*;

public class add_sub_mul_div {

   public static void main(String[] args) {

      BigInteger a, b;
      b = new BigInteger("2");
      a = new BigInteger("9");

      System.out.println("a*b: " + a.multiply(b));
      System.out.println("a+b: " + a.add(b));
      System.out.println("b-a: " + b.subtract(a));
      System.out.println("b/a: " + b.divide(a));
   }
}
