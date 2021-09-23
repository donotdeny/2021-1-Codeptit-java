import java.util.Scanner;

public class test {
    static boolean isDigit(char c){
        int num = c - '0';
        if(num >= 0 && num <= 9) return true;
        return false;
    }
    static boolean check(String s){
        if(s.charAt(0) == '0') return false;
        for(int i = 0; i < s.length(); i++){
            if(!isDigit(s.charAt(i))) return false;
        }
        return true;
    }
    static boolean even(String s){
        int countEven = 0;
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) - '0') % 2 == 0) countEven++;
        }
        if((s.length() % 2 == 0) && countEven > (s.length() - countEven)) return true;
        return false;
    }
    static boolean odd(String s){
        int countOdd = 0;
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) - '0') % 2 != 0) countOdd++;
        }
        if((s.length() % 2 != 0) && countOdd > (s.length() - countOdd)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            String str = in.next();
            if(!check(str)) System.out.println("INVALID");
            else if(even(str) || odd(str)) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
