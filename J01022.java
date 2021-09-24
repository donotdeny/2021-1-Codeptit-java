import java.util.Scanner;

/**
 *
 * @author An
 */
public class J01022 {
    static long[] fibo = new long[100];
    static int Try(int n, long k){
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= fibo[n-2]) return Try(n-2, k); // neu k <= do dai cua xau n-2 thi ki tu can tim nam o vi tri k trong xau n-2
        else return Try(n-1, k-fibo[n-2]); // else nam o vi tri k - do dai cua xau n-2 cua xau n-1
    }
    static void setUp(){
        // khoi tao do dai cua cac xau fibonacci
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i < 93; i++)
            fibo[i] = fibo[i-2] + fibo[i-1];
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        setUp();
        while(t-- > 0){
            int n = ip.nextInt();
            long k = ip.nextLong();
            System.out.println(Try(n, k));
        }
        ip.close();
    }
}
