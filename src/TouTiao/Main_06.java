package TouTiao;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月12日 下午4:38:59 
 * 类说明 
 */
public class Main_06 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String ss = in.next();
		int n = in.nextInt();
		while(n > 0){			
			int p = in.nextInt();
			int l = in.nextInt();
			ss = getNewString(ss,p,l);
		}
		System.out.println(ss);
		in.close();
	}
	public static String getNewString(String s, int p, int l){
		String s1 = s.substring(p,p+l);
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb1 = new StringBuffer(s1);
		return sb.insert(p+1, sb1.reverse().toString()).toString();
	}

}
