import java.util.*;

public class J03010{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        ip.nextLine();
        String[] res = new String[t];
        int index = 0;
        while(t-- > 0){
            String s = ip.nextLine();
            s = s.toLowerCase();
            s = s.trim();
            char[] arr = s.toCharArray();
            int f = 0;
            res[index] = "";
            for(int i = arr.length-1; i >= 1; i--){
                if(arr[i-1] == ' '){
                    f = i;
                    break;
                }
            }
            for(int i = f; i < arr.length; i++){
                res[index] += arr[i];
            }
            res[index] += arr[0];
            for(int i = 0; i < f-1; i++){
                if(arr[i] == ' ' && arr[i+1] != ' ') res[index] += arr[i+1];
            }
            int stt = 0;
            for(int i = 0; i < index; i++){
                if(res[index].equals(res[i])) stt++;
            }
            if(stt == 0) System.out.println(res[index] +"@ptit.edu.vn");
            else{
                stt++;
                System.out.println(res[index] + stt +"@ptit.edu.vn");
            }
            index++;
        }
        ip.close();
    }
}
