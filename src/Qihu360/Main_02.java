package Qihu360;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月18日 上午10:12:43 
 * 类说明 
 */
public class Main_02 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();									
			for(int i = 0; i < n; i++){
				int per_num = in.nextInt();
				int count = in.nextInt();										
				int[][] relation = new int[count][2];
				for(int j = 0; j < per_num; j++){
					relation[j][0] = in.nextInt();
					relation[j][1] = in.nextInt();
				}
				isWho(per_num,count,relation);
			}
		}
		in.close();
	}
	public static void isWho(int n, int m, int[][] relation){
		int[] count = new int[n+1];
		for(int i = 0; i < m; i++){
			if(relation[i][0] != relation[i][1]){
				count[relation[i][1]]++;
			}
		}
		int f = 0;
		int k = 0;
		for(int i = 1; i <= n; i++){
			if(count[i] == n-1){
				f++;
				k = i;
			}
		}
		if(f == 1){
			System.out.println(1+"\n"+k);
		}else{
			System.out.println(0+"\n");
		}
	}

}
