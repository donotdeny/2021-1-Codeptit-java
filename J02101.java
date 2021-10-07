import java.util.*;

public class J02101 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-- > 0){
            int n = ip.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i < n; i++){
             for(int j = 0; j < n; j++){
                    arr[i][j] = ip.nextInt();
                }
            }
            for(int i = 0; i < n; i++){
                if(i % 2 == 0){
                    for(int j = 0; j < n; j++){
                       System.out.print(arr[i][j] + " ");
                    }
                }
                else {
                    for(int j = n-1; j >= 0; j--){
                       System.out.print(arr[i][j] + " ");
                   }
               }  
            }
            System.out.println();
        }
        ip.close();
    }
}
