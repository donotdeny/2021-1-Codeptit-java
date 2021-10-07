import java.util.*;

public class J02106 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt(), count = 0;
        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++){
            int inc = 0;
            for(int j = 0; j < 3; j++){
                arr[i][j] = ip.nextInt();
                if(arr[i][j] == 1) inc++;
            }
            if(inc > 3-inc) count++;
        }
        System.out.println(count);
        ip.close();
    }
}
