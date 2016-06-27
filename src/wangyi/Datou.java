package wangyi;

import java.util.Scanner;



/** 
 * author: christ 
 * data：2016年3月15日 下午4:44:30 
 * 类说明 
 */
public class Datou {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int dist = sc.nextInt();		 
		int[] parr = new int[6];
		for(int i = 0; i < 6; i++){
			parr[i] = sc.nextInt();
		}
		int x0 = sc.nextInt();
		int y0 = sc.nextInt();
		int harm = 0;
		for(int i = 0; i < 6; i = i+2){
			if(Math.pow(parr[i]-x0, 2.0)+Math.pow(parr[i+1]-y0, 2.0) <= Math.pow(dist, 2.0)){
				harm++;
			}
		}
		System.out.println(harm+"x");
	}

}
