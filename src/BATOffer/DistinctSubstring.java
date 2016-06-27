package BATOffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/** 
 * author: christ 
 * data：2016年5月4日 下午7:42:49 
 * 类说明 
 */
public class DistinctSubstring {
	public int longestSubstring(String A,int n){
		HashMap<Character,Integer> arr = new HashMap<Character,Integer>();	
		int cur = 0;
		int res = 1;
		for(int i = 0; i < n; i++){
			if(arr.containsKey(new Character(A.charAt(i)))){
				if(arr.get(new Character(A.charAt(i))) >= cur){
					res = i-arr.get(new Character(A.charAt(i)));
				}
			}
			else{
				
			}
		}
		
		
		return res;
	}
}
