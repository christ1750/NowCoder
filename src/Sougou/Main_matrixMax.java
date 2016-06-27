package Sougou;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月22日 下午9:30:13 
 * 类说明 
 */
public class Main_matrixMax {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int m = in.nextInt();
			int[][] matrix = new int[n][m];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					matrix[i][j] = in.nextInt();
				}
			}
			int max = -1;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					int r = getMax(matrix,i,j);
					if(r > max){
						max = r;
					}
				}
			}
			System.out.println(max);
		}
		in.close();
	}
	public static int getMax(int[][] a,int I, int J){
		int max = 1;
		for(int i = 0; i < a.length; i ++){
			if(i == I){
				continue;
			}else{
				max = max*a[I][i];
			}
		}
		for(int i = 0; i < a[0].length; i++){
			if(i == J){
				continue;
			}else{
				max = max*a[i][J];
			}
		}
		return max;
	}
	

}
