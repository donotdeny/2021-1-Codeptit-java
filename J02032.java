import java.util.Scanner;
import java.util.Arrays;

public class J02032{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-- > 0){
            int n, index = 0;
            n = ip.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            String[] res = new String[n];
            for(int i = 0; i < n; i++){
                a[i] = ip.nextInt();
                b[i] = a[i];
            }
            Arrays.sort(b);
            for(int i = 0; i < n; i++){
                boolean ok = false;
                int p = i+1;
                for(int j = 0; j < n; j++){
                    if(a[j] != b[j]){
                        ok = true;
                        break;
                    }
                }
                if(!ok) break;
                for(int j = 0; j < n-1; j++){
                    if(a[j] > a[j+1]){
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
                res[index] = "Buoc " + p + ": ";
                for(int l = 0; l < n; l++){
                  res[index] += a[l] + " ";
                }
                index++;
            }
            for(int i = index-1; i >= 0; i--){
                System.out.println(res[i]);
            }
        }   
        ip.close();
    }
}
