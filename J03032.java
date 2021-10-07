import java.util.*;

public class J03032 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        ip.nextLine();
        while(t-- > 0){
            String str = ip.nextLine();
            String[] res = str.split(" ");
            for(int i = 0; i < res.length; i++){
                StringBuffer s = new StringBuffer(res[i]).reverse();
                System.out.print(s + " ");
            }
            System.out.println();
        }
        ip.close();
    }
}
