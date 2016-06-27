package wangyi;


import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/** 
 * author: christ 
 * data：2016年6月27日 下午7:46:33 
 * 类说明 
 */
public class Main_Schoolarship {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int r = in.nextInt();
			int avg = in.nextInt();
			int count = 0;
			int a = 0;
			int b = 0;
			int normal = 0;
			Map<Integer, Integer> map = new TreeMap<>();
			for(int i = 0; i < n; i++){
				a = in.nextInt();
				normal = normal+a;
				b = in.nextInt();
				if(map.get(b) != null){
					map.put(b, map.get(b)+r-a);
				}else{
					map.put(b, r-a);
				}
			}
			int total = n*avg;
			int gap = total-normal;
			Set<Integer> set = map.keySet();
			int index = 0;
			for(Integer e : set){
				index = map.get(e);
				if(index <= gap){
					gap -=index;
				}else{
					count += e*gap;
					break;
				}				
			}
			System.out.println(count);			
		}
		in.close();		
	}
}
