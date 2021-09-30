import java.util.*;

public class J01018 {
    static int abs(int a, int b){
        if(a > b) return a-b;
        return b-a;
    }
    static boolean checkDistance(String n){
        for(int i = 0; i < n.length()-1; i++){
            int tmp1 = (int)(n.charAt(i) - '0');
            int tmp2 = (int)(n.charAt(i+1) - '0');
            if(abs(tmp1, tmp2) != 2) return false;
        }
        return true;
    }
    static boolean check(String n){
        int sum = 0;
        for(int i = 0; i < n.length(); i++){
            sum += (int)(n.charAt(i) - '0');
        }
        if(sum % 10 == 0 && checkDistance(n)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-- > 0){
            String n = ip.next();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
        ip.close();
    }
}
