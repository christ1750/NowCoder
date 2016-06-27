package MeiTuan;

import java.util.LinkedList;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月23日 上午9:44:52 
 * 类说明 
 */
public class Main_LastNum {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			LinkedList<Integer> s = new LinkedList<Integer>();
			LinkedList<Integer> s1 = new LinkedList<Integer>();
			for(int i = 0; i < n; i++){
				s.add(i);
			}
			while(s.size() != 1){
				int k = 0;
				while(k<s.size()){
					if(k%2 == 1){
						s1.add(s.get(k));
					}
					k++;
				}
				s.clear();
				for(int i:s1){
					s.add(i);
				}
				s1.clear();
			}
			System.out.println(s.get(0));
		}
		in.close();
	}

}
