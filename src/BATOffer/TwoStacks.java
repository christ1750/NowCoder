package BATOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/** 
 * author: christ 
 * data��2016��6��14�� ����3:19:22 
 * ��˵�� 
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
