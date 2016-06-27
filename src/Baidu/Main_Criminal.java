package Baidu;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月21日 下午7:31:59 
 * 类说明 
 */
public class Main_Criminal {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int t = in.nextInt();
			int c = in.nextInt();
			int[] value = new int[n];
			for(int i = 0; i < n; i++){
				value[i] = in.nextInt();
			}
			int count = 0;
			int sum = 0;
			for(int i = 0; i < c; i++){
				sum = sum+value[i];
			}
			if(sum <= t){
				count++;
			}
			for(int i = c; i < n;i++){
				sum = sum-value[i-c]+value[i];
				if(sum <= t){
					count++;
				}								
			}
			System.out.println(count);			
		}
		in.close();
	}

}
