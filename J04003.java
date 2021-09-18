import java.util.Scanner;

public class J04003{
    private static long tu;
    private static long mau;
    static long gcd(long a, long b){
        if(b == 0) return a;
        else return gcd(b, a%b);
    }
    test(long t, long m){
        tu = t;
        mau = m;
    }
    void getOptimize(){
        long GCD = gcd(tu, mau);
        tu /= GCD;
        mau /= GCD;
    }
    void print(){
        System.out.println(tu + "/" + mau);
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        long tu = ip.nextLong();
        long mau = ip.nextLong();
        test obj = new test(tu, mau);
        obj.getOptimize();
        obj.print();
        ip.close();
    }
}
