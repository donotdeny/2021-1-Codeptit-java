import java.util.*;
import java.util.TreeSet;
import java.util.Set;

public class test {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for(int i = 0; i < n; i++){
            set1.add(in.nextInt());
        }
        for(int i = 0; i < m; i++){
            set2.add(in.nextInt());
        }
        for(Integer element : set1){
            if(set2.contains(element)) System.out.print(element + " ");
        }
        System.out.println();
        in.close();
    }
}
