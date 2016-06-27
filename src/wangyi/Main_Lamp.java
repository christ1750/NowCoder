package wangyi;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月27日 下午7:56:44 
 * 类说明 
 */
public class Main_Lamp {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			long l = in.nextInt();
			long[] location = new long[n];
			for(int i = 0; i < n; i++){
				location[i] = in.nextInt();
			}
			Arrays.sort(location);
			double max = Integer.MIN_VALUE;
			double temp = 0.0;
			for(int i = n-1; i > 0; i--){
				if(location[i]-location[i-1]>max){
					max = location[i]-location[i-1];
					System.out.println(max);
				}
			}
			temp = max;
			if(l-location[n-1] >= max/2){
				max = l-location[n-1];
				System.out.println(max);
			}			
			if(location[0]-0 >= temp/2 && location[0]-0 > max){
				if(location[0]-0 > max){
					max = location[0]-0;
				}				
				System.out.println(max);
			}
			DecimalFormat df = new DecimalFormat("0.00");
			if(max == l-location[n-1] || location[0]-0 == max){
				System.out.println(df.format(max));
			}else{
				System.out.println(df.format(max/2));
			}
			
		}
		in.close();
	}

}
