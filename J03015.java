import java.util.*;

public class J03015 {
    static boolean isSmaller(String s1, String s2){
        int n1 = s1.length(), n2 = s2.length();
        if(n1 < n2) return true;
        if(n2 < n1) return false;
        for(int i = 0; i < n1; i++){
            if(s1.charAt(i) < s2.charAt(i)) return true;
            else if(s1.charAt(i) > s2.charAt(i)) return false;
        }
        return false;
    }
    static boolean testZero(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0') return false;
        }
        return true;
    }
    static String subString(String str1, String str2){
        String str = "";
        int flag = 0;
        if(isSmaller(str1, str2)){
            String t = str1;
            str1 = str2;
            str2 = t;
            flag = 1;
        }
        int carry = 0;
        int n1 = str1.length(), n2 = str2.length();
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();
        for(int i = 0; i < n2; i++){
            int sub = ((int)(str1.charAt(i) - '0') - (int)(str2.charAt(i) - '0') - carry);
            if(sub < 0){
                sub += 10;
                carry = 1;
            }
            else carry = 0;
            str += (char)(sub + '0');
        }
        for(int i = n2; i < n1; i++){
            int sub = ((int)(str1.charAt(i) - '0') - carry);
            if(sub < 0){
                sub += 10;
                carry = 1;
            }
            else carry = 0;
            str += (char)(sub + '0');
        }
        String res = new StringBuilder(str).reverse().toString();
        for(int i = 0; i < res.length(); i++){
            if(res.charAt(i) != '0'){
                res = res.substring(i);
                break;
            }
        }
        if(flag == 1) str = "-" + res;
        else str = res;
        if(testZero(str)) return "0";
        else return str;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String num1, num2;
        num1 = ip.next();
        num2 = ip.next();
        for(int i = 0; i < num1.length(); i++){
            if(num1.charAt(i) != '0'){
                num1 = num1.substring(i);
                break;
            }
        }
        for(int i = 0; i < num2.length(); i++){
            if(num2.charAt(i) != '0'){
                num2 = num2.substring(i);
                break;
            }
        }
        System.out.println(subString(num1, num2));
        ip.close();
    }
}
