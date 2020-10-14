import java.math.BigInteger;
public class compare_func {

   public static void main(String[] args) {
      BigInteger b1, b2;

      b1 = new BigInteger("321456");
      b2 = new BigInteger("321456");

      // apply compareTo() method
      int comparevalue = b1.compareTo(b2);

      if (comparevalue == 0) {
         System.out.println("BigInteger1: "+ b1 + " and BigInteger2: "+ b2 + " are equal");
      } 
      else if (comparevalue == 1) {
         System.out.println("BigInteger1: " + b1 + " is greater than BigInteger2: " + b2);
      } 
      else {
         System.out.println("BigInteger1: " + b1 + " is lesser than BigInteger2: " + b2);
      }
   }
}
