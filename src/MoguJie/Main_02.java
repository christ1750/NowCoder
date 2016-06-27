package MoguJie;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月16日 下午4:03:28 
 * 类说明 
 */
public class Main_02 {
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
