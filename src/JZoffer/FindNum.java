package JZoffer;

import java.util.ArrayList;
import java.util.Collections;

/** 
 * author: christ 
 * data：2016年2月27日 上午10:02:18 
 * 类说明 
 */
public class FindNum {
	public ArrayList<Integer> FindNumWithSum(int[] array,int sum){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		if(array.length == 0){
			return arrayList;
		}
		if(sum < array[0]){
			return arrayList;
		}
		int flag = 0;
		for(int i = 0; i < array.length; i++){
			for(int j = i+1; j < array.length; j++){
				if(array[i] + array[j] == sum){
					arrayList.add(array[i]);
					arrayList.add(array[j]);
					flag = 1;
					break;
				}
				if(flag == 1){
					if(array[i] * array[j] < arrayList.get(0)*arrayList.get(1)){
						arrayList.remove(0);
						arrayList.remove(1);
						arrayList.add(array[i]);
						arrayList.add(array[j]);
						break;
					}
				}
			}
		}
		return arrayList;
	}
		
}
