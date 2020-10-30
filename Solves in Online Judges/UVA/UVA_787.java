import java.math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
class UVA_787 {

   static void Max_Subseq(int n, int a[]) {
      BigInteger ans = new BigInteger("0");
      BigInteger mx = new BigInteger("-9999999");
      for (int i = 0; i < n; i++) {
         ans = BigInteger.valueOf(a[i]);
         mx = ans.max(mx);
         for (int j = i + 1; j < n; j++) {
            ans = ans.multiply(BigInteger.valueOf(a[j]));
            mx = ans.max(mx);
         }
      }
      System.out.println(mx);
   }
   public static void main(String[] args) {
      // FastReader sc = new FastReader();
      Scanner sc = new Scanner(System.in);


      int a[] = new int[105], x, n = 0, i = 0;

      while (sc.hasNextInt()) {
         n = sc.nextInt();
         if (n != -999999) {
            a[i] = n;
            i++;
         } else {
            Max_Subseq(i, a);
            i = 0;
         }
      }
   }
}