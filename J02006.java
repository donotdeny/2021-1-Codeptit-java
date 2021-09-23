import java.util.*;
import java.util.TreeSet;
import java.util.Set;

public class test {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < n+m; i++){
            set.add(in.nextInt());
        }
        for(Integer elements : set){
            System.out.print(elements + " ");
        }
        System.out.println();
        in.close();
    }
}
