package TouTiao;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月10日 下午5:58:56 
 * 给出 n 个字符串，对于每个 n 个排列 p，按排列给出的顺序(p[0] , p[1] … p[n-1])依次连接这 n 个字符串都能得到一个长度为这些字符串长度之和的字符串。
 * 按照这个方法一共可以生成 n! 个字符串。
 * 一个字符串的权值等于把这个字符串循环左移 i 次后得到的字符串仍和原字符串全等的数量，i 的取值为 [1 , 字符串长度]。
 * 求这些字符串最后生成的 n! 个字符串中权值为 K 的有多少个。
 */
public class Main_MagicWeight {
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
