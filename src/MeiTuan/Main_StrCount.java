package MeiTuan;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月28日 下午5:05:30 
 * 类说明 
 */
public class Main_StrCount {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str1 = in.next();
			String str2 = in.next();
			int a = in.nextInt();
			int b = in.nextInt();
			int count = 0;
			for(int i = a; i < b; i++){
				count +=getCount(str1, str2, i);
			}
			System.out.println(count-1);
		}
		in.close();
	}
	public static int getCount(String str1, String str2, int len){
		int c1 = 0;
		int c2 = 0;
		int temp = 1;
		for(int i = len-1; i >= 0; i--){
			c1 += str1.charAt(i)*temp;
			c2 += str2.charAt(i)*temp;
			temp *=26;
		}
		return c2-c1;
	}

}
