package TouTiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月10日 上午11:08:34 
 * 类说明 
 */
public class Main_04 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		long x = in.nextInt();
		long k = in.nextInt();			
		int max = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while(x != 0){
			if((x%1) == 0){
				list.add(max);
			}
			max++;
			x = (x>>1);
		}
		int n = 0;
		int size = list.size();
		while(k != 0){
			if(n < size){
				if((k%1) == 0){
					list.add(max++);
				}else{
					max++;
				}
			}
			k = (k>>1);
			n++;
		}
		
		long result = 0L;
		int min = list.size() > n ?n:list.size();
		for(int i = 0; i < min; i++){
			if(list.get(i) != null && list.get(i) >= 0){
				result +=Math.pow(2, list.get(i));
			}
		}
		System.out.println(result);		
		in.close();		
	}
}
