package BATOffer;

import java.util.Arrays;
import java.util.Comparator;

/** 
 * author: christ 
 * data：2016年6月15日 下午4:29:33 
 * 类说明 
 */
public class Piror {	
	public static class MyComparator implements Comparator<String>{
		public int compare(String a, String b){
			return (a+b).compareTo(b+a);
		}
	}
	public String findSmallest(String[] strs, int n){
		if(strs == null || n == 0){
			return "";
		}
		Arrays.sort(strs,new MyComparator());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			sb.append(strs[i]);
		}
		return sb.toString();
	}

}
