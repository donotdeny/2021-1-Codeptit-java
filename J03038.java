import java.util.*;

public class J03038 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        String s = ip.next();
        for(int i = 0; i < s.length(); i++){
            String tmp = "";
            tmp += s.charAt(i);
            set.add(tmp);
        }
        System.out.println(set.size());
        ip.close();
    }
}
