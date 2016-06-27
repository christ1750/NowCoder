package BATOffer;

import java.util.ArrayList;
import java.util.List;

/** 
 * author: christ 
 * data：2016年6月13日 下午4:50:20 
 * 类说明 
 * 取反+down
 */
public class FoldPaper {
	public String[] foldPaper(int n){
		List<String> list = new ArrayList<String>();
		fold(1,n,true,list);
		String[] res = new String[list.size()];
		for(int i = 0; i < list.size(); i++){
			res[i] = list.get(i);
		}
		return res;
	}
	private void fold(int i, int n, boolean down, List<String> list){
		if(i > n){
			return;
		}
		fold(i+1,n,true,list);
		list.add(down?"down":"up");
		fold(i+1,n,false,list);
	}

}
