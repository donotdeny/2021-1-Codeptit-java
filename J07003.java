import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class J07003 {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader("DATA.in"));
            String line = "", res = "";
            while((line = r.readLine()) != null){
                if(line != null) res += line;
            }
            BigInteger num = new BigInteger(res);
            res = num.toString();
            while(res.length() > 1){
                BigInteger left = new BigInteger(res.substring(0, res.length()/2));
                BigInteger right = new BigInteger(res.substring(res.length()/2, res.length()));
                BigInteger sum = left.add(right);
                System.out.println(sum);
                res = sum.toString();
            }
            r.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        }

    }
}
