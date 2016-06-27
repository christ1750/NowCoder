package Baidu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月9日 下午6:13:37 
 * 类说明 
 */

public class Main_03 {
	static class task{
		int begin;
		int end;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			List<task> list = new ArrayList<task>();
			for(int i = 0; i < n; i++){
				task t = new task();
				t.begin = in.nextInt();
				t.end = in.nextInt();
				list.add(t);
			}
			
			Collections.sort(list,new Comparator<task>(){
				
				public int compare(task o1,task o2){
					return o1.begin-o2.begin;
				}
			});
			
			Collections.sort(list,new Comparator<task>(){
				
				public int compare(task o1, task o2){
					if(o1.begin == o2.begin)
						return o1.end-o2.end;
					else
						return 0;
				}
				
			});
										
			int t = list.get(0).begin;
			double s = 0;
			for(int j = 0; j < list.size(); j++){
				if(t >= list.get(j).begin){
					s +=(t-list.get(j).begin);
				}
				t +=list.get(j).end;
			}
			DecimalFormat df = new DecimalFormat("0.0000");
			System.out.println(df.format(s/n));
		}
	}

}
