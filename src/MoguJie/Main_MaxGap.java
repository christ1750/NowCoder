package MoguJie;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年3月10日 下午7:43:09 
 * 类说明 
 */
public class Main_MaxGap {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = in.nextInt();
			}			
			int[] gapp = new int[n-1];
			for(int i = 1; i < n; i++){
				gapp[i-1] = arr[i]-arr[i-1];				
			}			
			int num = 0;
			int[] ga = new int[n-2];			
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < n-2; j++){
				int max = 0;
				for(int i = 0; i < n-1; i++){				
					if(i == j){
						ga[num++] = gapp[i]+gapp[i+1];
						i++;
					}else{
						ga[num++] = gapp[i];
					}
					if(max < ga[num-1]){
						max = ga[num-1];
					}
				}
				if(max < min){
					min = max;
				}
				num = 0;
			}
			System.out.println(min);			
		}
		in.close();		
	}
}
