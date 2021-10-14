import java.util.*;

/**
 *
 * @author An
 */
public class J02034 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        HashSet<Integer> hash = new HashSet<>();
        int max = 0, num, key = 0;
        for(int i = 0; i < n; i++){
            num = ip.nextInt();
            if(max < num) max = num;
            hash.add(num);
        }
        for(int i = 1; i <= max; i++){
            if(hash.contains(i) == false){
                System.out.println(i);
                key = 1;
            }
        }
        if(key == 0) System.out.println("Excellent!");
        ip.close();
    }
}
