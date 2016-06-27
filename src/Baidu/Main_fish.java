package Baidu;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月21日 下午8:29:03 
 * 类说明 
 */
public class Main_fish {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String[] arr = in.nextLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			int x = Integer.parseInt(arr[2]);
			int y = Integer.parseInt(arr[3]);
			int t = Integer.parseInt(arr[4]);
			double sum = 0.0;
			double[][] grid = new double[n][m];
			for(int i = 0; i < n; i++){
				String[] s = in.nextLine().split(" ");
				for(int j = 0; j < m; j++){
					grid[i][j] = Double.parseDouble(s[j]);
					sum = sum+grid[i][j];
				}
			}
			double p_a = grid[x-1][y-1];
			double p_b = sum/(n*m);
			if(Math.abs(p_a-p_b)<0.0000001){
				System.out.println("equal");
				System.out.println(String.format("%.2f", 1-Math.pow(1-p_a, t)));
			}else if(p_a > p_b){
				System.out.println("cc");
				System.out.println(String.format("%.2f", 1-Math.pow(1-p_a, t)));
			}else{
				System.out.println("ss");
				System.out.println(String.format("%.2f", 1-Math.pow(1-p_b, t)));
			}
		}
		in.close();
	}

}
