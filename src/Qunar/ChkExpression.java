package Qunar;

import java.util.Stack;

/** 
 * author: christ 
 * data：2016年6月24日 上午9:05:31 
 * 类说明 
 */
public class ChkExpression {
	public boolean chkLegal(String A){
		boolean flag = true;
		Stack<Character> s1 = new Stack<Character>();
		Stack<Character> s2 = new Stack<Character>();
		Stack<Character> s3 = new Stack<Character>();
		int len = A.length();
		for(int i = 0; i < len; i++){
			char ch = A.charAt(i);
			switch(ch){
			case '{':
				s1.push(ch);
				break;
			case '[':
				s2.push(ch);
				break;
			case '(':
				s3.push(ch);
				break;
			case '}':
				if(s1.peek() == '}'){
					s1.pop();
				}
				break;
			case ']':
				if(s2.peek() == ']'){
					s2.pop();
				}
				break;
			case ')':
				if(s3.peek() == ')'){
					s3.pop();
				}
				break;
			default:
				break;
			}
		}
		return s1.isEmpty()&&s2.isEmpty()&&s3.isEmpty();
	}

}
