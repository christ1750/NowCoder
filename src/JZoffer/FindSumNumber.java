package JZoffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/** 
 * author: christ 
 * data：2016年3月5日 下午7:45:13 
 * 类说明 
 */
public class FindSumNumber {
	public ArrayList<Integer> FindNumbersWithSum(int[] array,int sum){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(array == null){
			return list;
		}
		int i = 0;
		int j = array.length - 1;
		while(i < j){
			if(array[i] + array[j] == sum){
				list.add(array[i]);
				list.add(array[j]);
				return list;
			}
			if(array[i] + array[j] > sum){
				j--;			
			}
			if(array[i] + array[j] < sum){
				i++;
			}
		}
		return list;
	}
}
