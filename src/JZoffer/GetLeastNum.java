package JZoffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/** 
 * author: christ 
 * data：2016年3月3日 下午2:49:15 
 * 类说明 
 */
public class GetLeastNum {
	public ArrayList<Integer> GetLeastNumbers(int[] input,int k){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(input == null || input.length < 1 || k> input.length){
			return res;
		}
		TreeSet<Integer> kSet = new TreeSet<Integer>();
		for(int i = 0; i < input.length; i++){
			if(kSet.size() < k){
				kSet.add(input[k]);
			}else{
				if(input[i] < kSet.last()){
					kSet.remove(kSet.last());
					kSet.add(input[i]);
				}
			}
		}
		Iterator<Integer> it = kSet.iterator();
		while(it.hasNext()){
			res.add(it.next());
		}
		return res;
	}

}
