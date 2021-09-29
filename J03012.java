import java.util.*;

public class J03012 {
    static boolean smaller(String s1, String s2){
        if(s1.length() > s2.length()) return false;
        else if(s1.length() < s2.length()) return  true;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) < s2.charAt(i)) return true;
            else if(s1.charAt(i) > s2.charAt(i)) return false;
        }
        return false;
    }
    static String sum(String s1, String s2){
        int flag = 0;
        String res = "";
        if(smaller(s1, s2)){
            String t = s1;
            s1 = s2;
            s2 = t;
        }
        s1 = new StringBuffer(s1).reverse().toString();
        s2 = new StringBuffer(s2).reverse().toString();
        for(int i = 0; i < s2.length(); i++){
            int tmp = (int)(s1.charAt(i) - '0') + (int)(s2.charAt(i) - '0') + flag;
            if(tmp >= 10){
                tmp -= 10;
                flag = 1;
            }
            else flag = 0;
            res += (char)(tmp + '0');
        }
        for(int i = s2.length(); i < s1.length(); i++){
            int tmp = (int)(s1.charAt(i) - '0') + flag;
            if(tmp >= 10){
                tmp -= 10;
                flag = 1;
            }
            else flag = 0;
            res += (char)(tmp + '0');
        }
        if(flag == 1){
            res += "1";
        }
        res = new StringBuffer(res).reverse().toString();
        return res;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-- > 0){
            String num1 = ip.next();
            String num2 = ip.next();
            System.out.println(sum(num1, num2));
        }
        ip.close();
    }   
}
