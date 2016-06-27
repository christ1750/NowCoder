package MoguJie;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月16日 下午4:00:24 
 * 类说明 
 */
public class Main_01 {
	public class desk{
		int len = 0;
		int cost = 0;
		public desk(int len, int cost){
			this.len = len;
			this.cost = cost;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();			
			int[] l = new int[n];
			int[] d = new int[n];
			for(int i = 0; i < n; i++){
				l[i] = in.nextInt();
			}
			for(int i = 0; i < n; i++){
				d[i] = in.nextInt();
			}			
		}
		in.close();
	}

}
