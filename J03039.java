import java.math.BigInteger;
import java.util.*;
public class J03039 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-- > 0){
            String a = ip.next();
            String b = ip.next();
            BigInteger num1 = new BigInteger(a);
            BigInteger num2 = new BigInteger(b);
            BigInteger res1 = num1.mod(num2);
            BigInteger res2 = num2.mod(num1);
            String ans1 = res1.toString();
            String ans2 = res2.toString();
            if(ans1.equals("0") || ans2.equals("0")) System.out.println("YES");
            else System.out.println("NO");
        }
        ip.close();
    }
}
