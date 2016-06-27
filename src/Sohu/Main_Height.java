package Sohu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月21日 下午3:39:44 
 * 类说明 
 */
public class Main_Height {
	public static class people{
		int num;
		int weight;
		int height;
	}
	public static class myComparator implements Comparator<people>{

		@Override
		public int compare(people o1, people o2) {
			if(o1.weight != o2.weight){
				return o1.weight-o2.weight;
			}else{
				return o2.height-o1.height;
			}
		}
		
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			people[] p = new people[n];
			for(int i = 0; i < n; i++){
				p[i] = new people();
				p[i].num = i;
				p[i].weight = in.nextInt();
				p[i].height = in.nextInt();
			}
			Arrays.sort(p,new myComparator());
			int[] m = new int[n];
			m[0] = 1;
			for(int i = 1; i < n; i++){
				m[i] = 1;
				for(int j = 0; j < n; j++){
					if(p[j].height <= p[i].height && m[i]<m[j]+1){
						m[i] = m[j] + 1;
					}
				}
			}
			int max = 0;
			for(int i = 0; i < n; i++){
				if(m[i] > max){
					max = m[i];
				}
			}
			System.out.println(max);
		}
		in.close();
	}

}
