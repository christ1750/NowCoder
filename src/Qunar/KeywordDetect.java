package Qunar;

import java.util.ArrayList;

/** 
 * author: christ 
 * data：2016年6月24日 下午4:32:51 
 * 类说明 
 */
public class KeywordDetect {
	public int[] containKeyword(String[] A, int n, String[] keys, int m){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(A[i].contains(keys[j])&&!list.contains(i)){
					list.add(i);
				}
			}
		}
		int[] result;
		if(list.size() == 0){
			result = new int[]{-1};
		}else{
			result = new int[list.size()];
		}
		for(int k = 0; k < list.size(); k++){
			result[k] = list.get(k);
		}
		return result;
	}

}
