package TouTiao;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月10日 下午5:58:56 
 * 类说明 
 */
public class Main_03 {
	public static int num;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++){
			str[i] = in.next();
		}
		in.close();
		perm(str,0,str.length-1,k);
		System.out.println(num);
	}
	public static String[] swap(String[] buf, int a,int b){
		String temp = buf[a];
		buf[a] = buf[b];
		buf[b] = temp;
		return buf;
	}
	
	public static void perm(String[] buf, int start, int end, int k){
		if(start == end){
			String s = "";
			for(int i = 0; i <= end; i++){
				s +=buf[i];
			}
			judge(s,k);
		}
		else{
			for(int i = start; i <= end; i++){
				buf = swap(buf,start, i);
				perm(buf,start+1,end,k);
				buf = swap(buf,start,i);
			}
		}
	}
	public static void judge(String S, int k){
		int count = 0;
		String string = S+S;
		for(int i = 1; i < S.length()+1; i++){
			if(S.equals(string.substring(i,i+S.length()))){
				count+=1;
			}
		}
		if(count == k){
			num++;
		}
	}

}
