package wangyi;

import java.util.Scanner;

/** 
 * 
 */
public class CD_num {
	public static void main(String[] args){
		Scanner in =  new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int s = in.nextInt();
			int L = in.nextInt();
			int l = L;
			int res = 0;
			int m = n;
			int num = 0;
			int a = 0;
			while(n > 0){
				l = L;
				num = 0;
				while(l-s>0&&num!=13&&l>0){
					l = l-s;
					num++;
					l--;
					n--;
					System.out.println(num +" "+l+" "+n);
				}
				a = (int) Math.ceil(m*1.0/num);
				System.out.println(Math.ceil(m*1.0/num));
				res++;
			}
			System.out.println(a);
			System.out.println(res);
		}
		in.close();
	}
}
