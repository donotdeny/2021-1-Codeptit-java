import java.util.*;
import java.math.BigInteger;

public class J03033 {
    public static BigInteger LCM(String a, String b){
        BigInteger s1 = new BigInteger(a);
        BigInteger s2 = new BigInteger(b);
        BigInteger mul = s1.multiply(s2);
        BigInteger gcd = s1.gcd(s2);
        BigInteger lcm = mul.divide(gcd);
        return lcm;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        ip.nextLine();
        while(t-- > 0){
            String s1 = ip.next();
            String s2 = ip.next();
            System.out.println(LCM(s1, s2));
        }
        ip.close();
    }
}
