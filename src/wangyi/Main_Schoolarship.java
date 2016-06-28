package wangyi;

import java.util.Scanner;



/** 
 * author: christ 
 * data：2016年6月27日 下午7:46:33 
 * 类说明 
 */
public class Main_Schoolarship {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			long r = in.nextLong();
			long avg = in.nextLong();
			long[][] arr = new long[n][2];
			long total = avg*n;
			long score = 0;
			for(int i = 0; i < n; i++){
				arr[i][0] = in.nextLong();
				arr[i][1] = in.nextLong();
				score +=arr[i][0];
			}
			sort(arr);
			long time = 0;
			int i = 0;
			while(score < total && i < n){
				if(arr[i][0] < r){
					time +=arr[i][1];
					score++;
					arr[i][0] += 1;
				}else{
					i++;
				}
			}
			System.out.println(time);
		}
		in.close();
	}
	public static void sort(long[][] a){
		for(int i = 0; i < a.length-1; i++){
			boolean flag = true;
			for(int j = 0; j < a.length-1; j++){
				if(a[j][1] > a[j+1][1]){
					long temp = a[j][0];
					long temp2 = a[j][1];
					a[j][0] = a[j+1][0];
					a[j+1][0] = temp;
					a[j][1] = a[j+1][1];
					a[j+1][1] = temp2;
					flag = false;
				}
				if(flag){
					return;
				}
			}
		}
	}
}
