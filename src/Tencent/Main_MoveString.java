package Tencent;

import java.util.LinkedList;
import java.util.Scanner;

/** 
 * author: christ 
 * data��2016��6��9�� ����8:40:54 
 * ��һ���ַ����Ĵ�д��ĸ�ŵ��ַ����ĺ��棬
 * �����ַ������λ�ò��䣬�Ҳ����������Ŀռ�
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
