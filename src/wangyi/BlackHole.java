package wangyi;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年7月29日 下午7:58:14 
 * 类说明 
 */
public class BlackHole {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int a = in.nextInt();
			int[] arr1 = new int[4];
			int[] arr2 = new int[4];			
			int res1 = 0;
			int res2 = 0;
			int res3 = 0;
			while(res1 - res2!=6174){
				res1 = 0;
				res2 = 0;
				int i = 0;
				while(a != 0){
					arr1[i] =a%10;
					i++;
					a = a/10;
					//System.out.println(arr1[i-1]);
				}				
				Arrays.sort(arr1);//小的数
				for(i = 3; i >= 0; i--){
					res2 += arr1[i]*Math.pow(10, 3-i);
				}
				//System.out.println(res1);				
				for(i = 0; i < 4; i++){
					arr2[i] = arr1[3-i];
				}
				for(i = 3; i >= 0; i--){
					res1 += arr2[i]*Math.pow(10, 3-i);
				}
				//System.out.println(res2);
				res3 = res1-res2;
				a = res3;
				System.out.println(res1 +" - "+res2+" = "+res3);
			}						
		}
		in.close();
	}
}
