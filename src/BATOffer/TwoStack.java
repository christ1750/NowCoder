package BATOffer;

import java.util.ArrayList;
import java.util.Stack;

/** 
 * author: christ 
 * data：2016年6月14日 上午9:36:16 
 * 类说明 
 */
public class TwoStack {
	public int[] twoStack(int[] ope, int n){
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();		
		int count = 0;
		for(int i = 0; i < n; i++){
			if(ope[i] > 0){
				s1.push(ope[i]);
			}
			if(ope[i] == 0){
				count++;				
			}
		}		
		int[] res = new int[count];
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		int i = 0;
		while(!s2.isEmpty()&&count>0){
			res[i++] = s2.pop();
			count--;
		}
		return res;
	}
	

}
