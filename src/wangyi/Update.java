package wangyi;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年3月15日 下午4:14:46 
 * 类说明 
 */
public class Update {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num <= 0){
			System.exit(0);
		}
		int[] array = new int[num];
		int init = sc.nextInt();
		if(num < 1 || num >= 10000){
			System.exit(0);
		}
		for(int i = 0; i < num; i++){
			array[i] = sc.nextInt();
			if(array[i] <= 0 || array[i] >= 10000){
				System.exit(0);
			}
		}
		for(int i = 0; i < num; i++){
			init = init + fight(init,array[i]);
		}
		System.out.println(init);
	}
	public static int fight(int i,int j){
		if(i >= j){
			return j;
		}else{
			return maxS(i,j);
		}
	}
	public static int maxS(int i, int j){
		while(i%j != 0){
			int temp = i%j;
			i = j;
			j = temp;
		}
		return j;
	}

}
