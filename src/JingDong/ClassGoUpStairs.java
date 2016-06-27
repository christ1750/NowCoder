package JingDong;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月10日 下午9:42:02 
 * 类说明 
 */
public class ClassGoUpStairs {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n+1];		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 2;
		for(int i = 4; i <= n; i++){
			arr[i] = arr[i-1]+arr[i-2];
			if(arr[i] > 1000000007){
				arr[i] %= 1000000007;
			}
		}
		System.out.println(arr[n]);
		in.close();
	}

}
