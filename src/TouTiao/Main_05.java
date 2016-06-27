package TouTiao;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月12日 下午3:04:29 
 * 类说明 
 */
public class Main_05 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int L = in.nextInt();
		int count = (L+1)/(s+1);
		count = Math.min(count, n);			
		if(count%13 == 0){
			count--;
		}
		int num = n/count;
		int last = (L+1)%(s+1);	
		if(last != 0){
			num++;
			if(last%13 == 0 && (count-last) == 1){
				num++;
			}
		}				
		System.out.println(num);		
		in.close();
	}	
}
