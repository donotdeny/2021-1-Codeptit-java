import java.util.*;
import java.util.Arrays;

public class test{
	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		int t = ip.nextInt();
		ip.nextLine();
		while(t-- > 0){
			String s1 = ip.nextLine();
			String s2 = ip.nextLine();
			String[] res1 = s1.split(" ");
			String[] res2 = s2.split(" ");
			Arrays.sort(res1);
			Arrays.sort(res2);
			for(int i = 0; i < res1.length; i++){
				int key = 0;
				for(int j = 0; j < i; j++){
					if(res1[i].equals(res1[j])) key = 1;
				}
				if(key != 1){
					int flag = 0;
					for(int l = 0; l < res2.length; l++){
						if(res1[i].equals(res2[l])){
							flag = 1;
							break;
						}
					}
					if(flag == 0) System.out.print(res1[i] + " ");
				}
			}
			System.out.println();
		}
		ip.close();
	}
}
