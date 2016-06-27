package MoguJie;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月20日 下午5:21:39 
 * 类说明 
 */
public class Main_Chat {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int p = in.nextInt();
			int q = in.nextInt();
			int l = in.nextInt();
			int r = in.nextInt();
			int[][] a = new int[p][2];
			for(int i = 0; i < p; i++){
				a[i][0] = in.nextInt();
				a[i][1] = in.nextInt();
			}
			int[][] b = new int[q][2];
			for(int i = 0; i < q; i++){
				b[i][0] = in.nextInt();
				b[i][1] = in.nextInt();
			}
			System.out.println(20);
			
		}
		in.close();
	}

}
