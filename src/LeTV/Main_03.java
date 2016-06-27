package LeTV;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月16日 上午11:08:52 
 * 类说明 
 */
public class Main_03 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int S = in.nextInt();
			double r = Math.sqrt(S);
			int num = 0;
			int j = 1;
			for(int i = (int) r; i >= 0; i--){				
				if(Math.pow(i,2)+Math.pow(r-i,2) == S){
					num++;
				}			
			}
			System.out.println(4*num);
		}
		in.close();
		
	}

}
