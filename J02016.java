import java.util.*;

public class J02016 {
    static boolean check(long[] arr, int n){
        // example arr = [3, 1, 4, 6, 5]
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] * arr[i]; // 9 1 16 36 25
        }
        Arrays.sort(arr);// 1 9 16 25 36 
        for(int i = n-1; i >= 2; i--){
            int l = 0;
            int r = i-1;
            while(l < r){
                if(arr[l] + arr[r] == arr[i]){
                    return true;
                }
                else {
                    if(arr[l] + arr[r] < arr[i]) l++;
                    else r--;
                }
            }
        }
        return false;
    }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = in.nextLong();
            }
            if(check(arr, n)) System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
