package MoguJie;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月16日 下午4:03:28 
 * 现有一个n个整数的序列，你要做的就是交换两个数的位置直到整个序列按照升序排列，那么将这个整数序列排好序，需要交换多少次？
 * 例如，1，2，3，5，4，我们只需要交换一次，即将5和4交换即可。
 *
 */
public class Main_SpecialExchange {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i <n; i++){
				arr[i] = in.nextInt();
			}
			int num = 0;
			for(int i = 0; i < n; i++){
				for(int j = i; j < n; j++){
					if(arr[i] > arr[j]){
						num++;
					}
				}
			}
			System.out.println(num);
			
		}
		in.close();
		
	}

}
