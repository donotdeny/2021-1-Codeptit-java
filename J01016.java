import java.util.*;

public class J01016 {
    static boolean check(String n){
        int count4 = 0, count7 = 0;
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) == '4') count4++;
            if(n.charAt(i) == '7') count7++;
        }
        if(count4 + count7 == 4 || count4 + count7 == 7) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String n = ip.next();
        if(check(n)) System.out.println("YES");
        else System.out.println("NO");
        ip.close();
    }
}
