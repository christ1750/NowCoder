package TouTiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月10日 上午11:08:34 
 * 给定 x, k ，求满足 x + y = x | y 的第 k 小的正整数 y 。 | 是二进制的或(or)运算，例如 3 | 5 = 7。
 * 比如当 x=5，k=1时返回 2，因为5+1=6 不等于 5|1=5，而 5+2=7 等于 5 | 2 = 7。
 */
public class Main_MinK {
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
