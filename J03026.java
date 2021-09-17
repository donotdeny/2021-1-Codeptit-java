import java.util.*;

public class J03026{
	private static int max(int a, int b){
		if(a > b) return a;
		else return b;
	}
	private static boolean checkEqual(String a, String b){
		if(a.length() != b.length()) return false;
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) != b.charAt(i)) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int t = ip.nextInt();
		ip.nextLine();
		while(t-- > 0){
			String s1 = ip.next();
			String s2 = ip.next();
			if(checkEqual(s1, s2)) System.out.println("-1");
			else{
				System.out.println(max(s1.length(), s2.length()));
			}
		}
		ip.close();
	}
}
