package Tencent;

import java.util.LinkedList;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月9日 下午8:40:54 
 * 把一个字符串的大写字母放到字符串的后面，
 * 各个字符的相对位置不变，且不能申请额外的空间
 */
public class Main_MoveString {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			String ss = in.nextLine();					
			LinkedList<Character> list = new LinkedList<>();
			for(int i = 0; i < ss.length(); i++){
				list.add(ss.charAt(i));
			}
			int count = 0;
			for(int i = 0; i < list.size(); i++){
				char a = list.get(i-count);
				if(a >= 'A' && a <= 'Z'){
					list.add(list.remove(i-count++));
				}
			}
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < list.size(); i++){
				sb.append(list.get(i));
			}
			System.out.println(sb);
		}
	}

}
