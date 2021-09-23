import java.util.Scanner;

public class test {
    static boolean check(String s){
        int n = s.length();
        for(int i = 0, j = n-1; i <= j; i++, j--){
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String str = in.next();
            str = str.toLowerCase();
            String res = "";
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c') res += '2';
                if(str.charAt(i) == 'd' || str.charAt(i) == 'e' || str.charAt(i) == 'f') res += '3';
                if(str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'i') res += '4';
                if(str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l') res += '5';
                if(str.charAt(i) == 'm' || str.charAt(i) == 'n' || str.charAt(i) == 'o') res += '6';
                if(str.charAt(i) == 'p' || str.charAt(i) == 'q' || str.charAt(i) == 'r' || str.charAt(i) == 's') res += '7';
                if(str.charAt(i) == 't' || str.charAt(i) == 'u' || str.charAt(i) == 'v') res += '8';
                if(str.charAt(i) == 'w' || str.charAt(i) == 'x' || str.charAt(i) == 'y' || str.charAt(i) == 'z') res += '9';
            }
            if(check(res)) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
