package TouTiao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月10日 上午10:47:30 
 * 有 n 个字符串，每个字符串都是由 A-J 的大写字符构成。
 * 现在你将每个字符映射为一个 0-9 的数字，不同字符映射为不同的数字。
 * 这样每个字符串就可以看做一个整数，唯一的要求是这些整数必须是正整数且它们的字符串不能有前导零。
 * 现在问你怎样映射字符才能使得这些字符串表示的整数之和最大？ 
 */
class Element{
	long w;
	boolean isCanBeZero = true;
}

public class Main_MaxValue {
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
