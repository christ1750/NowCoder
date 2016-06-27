package BATOffer;

import java.util.Stack;

/** 
 * author: christ 
 * data：2016年6月14日 上午9:11:12 
 * 类说明 
 */
public class Solution {
	private Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2 = new Stack<>();
	public void push(int node){
		s1.push(node);
		if(s2.isEmpty()){
			s2.push(node);
		}else if(s2.peek()>node){
			s2.push(node);
		}else{
			s2.push(s2.peek());
		}
	}
	public void pop(){
		s1.pop();
		s2.pop();
	}
	public int top(){
		return s1.peek();
	}
	public int min(){
		return s2.peek();
	}
}
