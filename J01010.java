import java.util.Scanner;

public class test {
    static boolean check(String s){
        int countZ = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') countZ++;
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9') return false;
        }
        if(countZ == s.length()) return false;
        return true;
    }
    static boolean checkRes(String res){
        for(int i = 0; i < res.length(); i++){
            if(res.charAt(i) != '0') return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String str = in.next();
            if(!check(str)) System.out.println("INVALID");
            else {
                String res = "";
                for(int i = 0; i < str.length(); i++){
                    if(str.charAt(i) == '0') res += '0';
                    if(str.charAt(i) == '1') res += '1';
                    if(str.charAt(i) == '8') res += '0';
                    if(str.charAt(i) == '9') res += '0';
                }
                if(checkRes(res)){
                    int flag = 0;
                    for(int i = 0; i < res.length(); i++){
                        if(res.charAt(i) != '0'){
                            System.out.print(res.charAt(i));
                            flag = 1;
                        }
                        else if(flag == 1) System.out.print(res.charAt(i));
                    }
                    System.out.println();
                }
                else System.out.println("INVALID");
            }
        }
        in.close();
    }
}
