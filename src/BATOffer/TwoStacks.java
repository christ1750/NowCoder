package BATOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/** 
 * author: christ 
 * data：2016年6月14日 下午3:19:22 
 * 类说明 
 */
public class TwoStacks {
	public ArrayList<Integer> twoStacksSort(int[] numbers){
		Stack<Integer> s1 = new Stack<>();		
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(numbers);
		for(int i = 0; i < numbers.length;i++){
			list.add(numbers[i]);
		}
		return list;
	}

}
