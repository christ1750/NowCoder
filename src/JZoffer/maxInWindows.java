package JZoffer;

import java.util.ArrayList;
import java.util.List;

/** 
 * author: christ 
 * data：2016年3月2日 上午9:32:41 
 * 类说明 
 */
public class maxInWindows {
	public ArrayList<Integer> maxInWindow(int[] num,int size){
		List<Integer> res = new ArrayList<Integer>();
		//List<Integer> arr = new ArrayList<Integer>();
		//int temp = num[0];
		for(int i = 0; i + size <= num.length; i++){
			int temp = num[i];
			//arr.add(num[i]);
			for(int j = 0; j < size; j++){
				if((i+j) < num.length && num[i+j] > temp){
					temp = num[i+j];
					//arr.remove(0);
					//arr.add(num[i+j]);
					//System.out.println("我是temp"+temp);
				}
			}
			res.add(temp);
			//temp = arr.get(0);
		}
		return (ArrayList<Integer>) res;
	}
	public static void main(String[] args){
		maxInWindows miw = new maxInWindows();
		int[] test = {2,3,4,2,6,2,5,1};
		ArrayList<Integer> aaa = miw.maxInWindow(test, 3);
		System.out.println(aaa);
	}

}
