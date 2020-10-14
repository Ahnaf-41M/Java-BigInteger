import java.math.BigInteger;
public class float_int_val {
    public static void main(String[] args) {
        // Creating 2 BigInteger objects
        BigInteger b1, b2;

        b1 = new BigInteger("32145");
        b2 = new BigInteger("7613721");

        // apply floatValue() method
        float floatValueOfb1 = b1.floatValue();
        int intValueOfb1 = b1.intValue();


        // print floatValue
        System.out.println("floatValue of "+ b1 + " : " + floatValueOfb1);
        System.out.println("intValue of "+ b1 + " : " + intValueOfb1);
    }
}
