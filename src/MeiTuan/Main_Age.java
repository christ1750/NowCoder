package MeiTuan;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月28日 下午4:12:51 
 * 类说明 
 */
public class Main_Age {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int W = in.nextInt();
			int Y = in.nextInt();
			double x = in.nextDouble();
			int N = in.nextInt();
			double y = Y;
			while(N>0){
				y = 21*x+(1-x)*(y+1);
				N--;
			}
			System.out.println((int)Math.ceil(y));
		}
	}

}
