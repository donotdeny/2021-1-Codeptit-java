import java.util.Scanner;

public class J02031{
    public static void main(String[] args){
        int n, index = 0;
        Scanner ip = new Scanner(System.in);
        n = ip.nextInt();
        int a[] = new int[n];
        String[] res = new String[n];
        for(int i = 0; i < n; i++){
            res[i] = "";
        }
        for(int i = 0; i < n; i++){
            a[i] = ip.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            int min = i, k = i+1;
            for(int j = i+1; j < n; j++){
                if(a[j] < a[min]) min = j;
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            //System.out.print("Buoc " + k + ": ");
            res[index] = "Buoc " + k + ": ";
            for(int l = 0; l < n; l++){
            //    System.out.print(a[l] + " ");
                res[index] += a[l] + " ";
            }
            //System.out.print('\n');
            index++;
        }
        for(int i = index-1; i >= 0; i--){
            System.out.println(res[i]);
        }
        ip.close();
    }
}
