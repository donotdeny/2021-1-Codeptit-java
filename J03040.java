/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noneOop;
import java.util.*;

/**
 *
 * @author An
 */
public class J03040 {
    static boolean increase(String s){
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) >= s.charAt(i+1)) return false;
        }
        return true;
    }
    static boolean equal(String s){
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1)) return false;
        }
        return true;
    }
    static boolean headEqualTail(String s){
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) return true;
        return false;
    }
    static boolean sixOrEight(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-- > 0){
            String s = ip.next();
            String res = s.substring(5, 8) + s.substring(9);
            if(increase(res) || equal(res) || headEqualTail(res) || sixOrEight(res)) System.out.println("YES");
            else System.out.println("NO");
        }
        ip.close();
    }
}
