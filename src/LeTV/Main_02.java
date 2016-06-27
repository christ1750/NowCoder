package LeTV;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月16日 上午10:21:56 
 * 类说明 
 */
public class Main_02 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int A = in.nextInt();
			int B = in.nextInt();			
			int count = 0;
			int lower = (int) Math.floor(A+A*0.05) ;
			int upper = Math.min((int) (A+A*0.1), B);
			for(int i = lower; i < upper; i++){
				if(i%5 == 0){
					lower = i;
					break;
				}
			}			
			count = (upper-lower)/5+1;
			System.out.println(count);
			
		}
		in.close();
	}

}
