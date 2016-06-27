package TouTiao;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月10日 上午11:21:35 
 * 类说明 
 */
public class Main_02 {
	public static void doDecision(ArrayList<Integer> list, int max, int sum){
		if(list.size() < 3){
			System.out.println("No");
		}else{
			if(sum > max){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
	
	public static int findMaxNum(ArrayList<Integer> list){
		if(list == null || list.size() == 0){
			return 0;
		}
		int max = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) > max){
				max = list.get(i);
			}
		}
		return max;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int type;
		Integer len;
		int max = 0;
		int sum = 0;
		for(int i = 0; i < n; i++){
			type = in.nextInt();
			len = in.nextInt();
			if(1 == type){
				list.add(len);
				if(len > max){
					sum +=max;
					max = len;
				}else{
					sum +=len;
				}
				doDecision(list,max,sum);
			}else if(2 == type){
				if(list.size() == 0){
					System.out.println("No");
					continue;
				}
				if(list.contains(len)){
					list.remove(len);
				}
				if(len >= max){
					max = findMaxNum(list);
					sum -= max;
				}else{
					sum -= len;
				}
				doDecision(list,max,sum);
			}
		}
		in.close();
	}

}
