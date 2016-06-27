package MoguJie;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月20日 下午3:13:04 
 * 类说明 
 */
public class Main_Basketball {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int p = in.nextInt();
			int n = in.nextInt();
			int[] basket = new int[p];
			for(int i = 0; i < p; i++){
				basket[i] = 0;
			}
			int[] ball = new int[n];
			for(int i = 0; i < n; i++){
				ball[i] = in.nextInt();
			}
			for(int i = 0; i < n; i++){
				if(basket[ball[i]%p] == 0){
					basket[ball[i]%p]++;
				}else{
					System.out.println(i+1);
					break;
				}
				if(i == n-1){
					System.out.println(-1);
				}
				
			}
			
		}
		in.close();
	}

}
