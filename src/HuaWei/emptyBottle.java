package HuaWei;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年3月11日 下午4:05:59 
 * 类说明 
 */
public class emptyBottle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNext()){
			int count = sc.nextInt();
			if(count != 0){
				emptyBottle eb = new emptyBottle();
				int a = eb.bottles(count);
				System.out.println(a);
			}
		}
	}
	public int bottles(int s){
		int res = 0;
		if(s == 0 || s == 1){
			return 0;
		}else if(s == 2 || s == 3){
			return 1;
		}
		else{
			return bottles((int)s/3+s%3)+(int)s/3;
		}
		
	}

}
