import java.util.*;

public class J01015 {
    static boolean triplet(int n){
        while(n > 0){
            int tmp = n % 10;
            if(tmp != 0 && tmp != 1 && tmp != 2) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-- > 0){
            int n = ip.nextInt();
            if(triplet(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        ip.close();
    }
}
