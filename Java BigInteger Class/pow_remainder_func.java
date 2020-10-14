import java.math.BigInteger;
public class pow_remainder_func {
    public static void main(String[] args) {
        BigInteger b1,b2;

        b1 = new BigInteger("321456");
        b2 = new BigInteger("10");
        int exponent = 5; //this should be int

        BigInteger result = b1.pow(exponent);
        BigInteger result2 = b1.remainder(b2);


        // print result
        System.out.println(b1 + " ^ " + exponent + " equal to " + result);
        System.out.println(b1 + " remainder " + b2 + " equal to " + result2);
    }
}
