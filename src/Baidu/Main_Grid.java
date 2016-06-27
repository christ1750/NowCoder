package Baidu;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月21日 下午8:11:40 
 * 类说明 
 */
public class Main_Grid {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[][] point = new int[n][2];
			for(int i = 0; i < n; i++){
				point[i][0] = in.nextInt();
				point[i][1] = in.nextInt();
			}
			int left = Integer.MAX_VALUE;
			int right = Integer.MIN_VALUE;
			int max = Integer.MIN_VALUE;
			int bottom = Integer.MAX_VALUE;
			int top = Integer.MIN_VALUE;
			for(int i = 0; i < n; i++){
				if(point[i][0] < left){
					left = point[i][0];
				}
				if(point[i][0] > right){
					right = point[i][0];
				}
				if(point[i][1] < bottom){
					bottom = point[i][1];
				}
				if(point[i][1] > top){
					top = point[i][1];
				}
				if(right-left > max){
					max = right-left;
				}
				if(top-bottom > max){
					max = top-bottom;
				}
			}
			int space = (int) Math.pow(max, 2);
			System.out.println(space);
		}
	}

}
