package Sohu;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月21日 下午4:00:58 
 * 类说明 
 */
public class Main_Bonus {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int[] c = new int[n];
			int i = 0;
			for(i = 0; i < n; i++){
				a[i] = in.nextInt();
				b[i] = 1;
				c[i] = 1;
			}
			for(i = 1; i < n; i++){
				if(a[i] > a[i-1]){
					b[i] = b[i-1]+1;
				}
			}
			for(i = n-1; i > 0; i--){
				if(a[i-1] > a[i]){
					c[i-1] = c[i]+1;
				}
			}
			int sum = 0;			
			for(i = 0; i < n; i++){
				sum = sum +Math.max(b[i], c[i]);
			}
			System.out.println(sum);
		}
		in.close();
	}

}
