package TouTiao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月10日 上午10:47:30 
 * 类说明 
 */
class Element{
	long w;
	boolean isCanBeZero = true;
}

public class Main_01 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		int n = in.nextInt();
		Element[] es = new Element[n];
		for(int i = 0; i < n; i++){
			es[i] = new Element();						 
		}
		String str = null;
		int j = 0;
		for(int i = 0; i < n; i++){
			str = in.next();
			es[str.charAt(0)-'A'].isCanBeZero = false;
			for(j = 0; j < str.length(); j++){
				es[str.charAt(j)-'A'].w += Math.pow(10, str.length()-j-1);
			}
		}
		
		Arrays.sort(es, new Comparator<Element>(){
			public int compare(Element o1,Element o2){
				long r = o1.w-o2.w;
				int res = 0;
				if(r > 0){
					res = 0;
				}else if(r < 0){
					res = -1;
				}
				return res;
			}
		});
		
		int zeroIndex = -1;
		
		for(int i = 0; i < 10; i++){
			if(es[i].isCanBeZero){
				zeroIndex = i;
				break;
			}
		}
		
		if(zeroIndex < 0){
			System.out.print(0);
			return;
		}
		
		long sum = 0;
		for(int i = 0; i < 10; i++){
			if(es[i].w > 0){
				if(i < zeroIndex){
					sum +=((i+1)*es[i].w);
				}else if(i > zeroIndex){
					sum += (i*es[i].w);
				}
			}
		}
		System.out.println(sum);
		in.close();
	}

}
