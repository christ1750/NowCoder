package JZoffer;

import java.util.Stack;

/** 
 * author: christ 
 * data：2016年2月26日 下午8:47:15 
 * 类说明 
 */
public class MinStack {
	Stack<Integer> data = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();
	Integer temp = null;
	public void push(int node){
		if(temp != null){
			if(temp >= node){
				temp = node;
				min.push(temp);
			}
			data.push(temp);
		}else{
			temp = node;
			data.push(temp);
			min.push(temp);
		}
	}
	public void pop(){
		int num = data.pop();
		int num2 = min.pop();
		if(num != num2){
			min.push(num2);
		}
	}
	
	public int top(){
		int num = data.pop();
		data.push(num);
		return num;
	}
	
	public int min(){
		int num = min.pop();
		min.push(num);
		return num;
	}

}
