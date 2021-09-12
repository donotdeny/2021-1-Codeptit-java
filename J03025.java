import java.util.*;

public class J03025{
    public static boolean check(String s){
        for(int i = 0, j = s.length()-1; i <= j; i++, j--){
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        ip.nextLine();
        while(t-- > 0){
            String s = ip.next();
            if(check(s)){
                if(s.length() % 2 == 0) System.out.println("NO");
                else System.out.println("YES");
            }
            else {
                int count = 0;
                for(int i = 0, j = s.length()-1; i <= j; i++, j--){
                    if(s.charAt(i) != s.charAt(j)) count++;
                }
                if(count > 1) System.out.println("NO");
                else System.out.println("YES");
            }
        }
        ip.close();
    }
}
