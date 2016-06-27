package Baidu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月9日 下午5:44:25 
 * 类说明 
 */
public class Main_02 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int m = in.nextInt();
			int[] p = new int[m];
			for(int i = 0; i < m; i++){
				p[i] = in.nextInt();
			}
			List ll = new ArrayList();
			int res = 0;
			for(int i = 0; i < m; i++){
				if(!ll.contains(p[i])){
					res++;
					if(ll.size() < n){
						ll.add(p[i]);
					}else{
						ll.remove(0);
						ll.add(p[i]);
					}
				}
			}
			System.out.println(res);
		}
	}

}
