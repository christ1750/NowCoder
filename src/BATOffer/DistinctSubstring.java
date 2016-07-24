package BATOffer;

/** 
 * author: christ 
 * data：2016年5月4日 下午7:42:49 
 * 类说明 
 */
public class DistinctSubstring {
	public int longestSubstring(String A,int n){
		if(A == null || n < 0){
			return 0;
		}
		int cur = 0;
		int pre = -1;
		int[] map = new int[256];
		int len = 0;
		char[] c = A.toCharArray();
		for(int i = 0; i < 256; i++){
			map[i] = -1;
		}
		for(int i = 0; i < n; i++){
			pre = Math.max(pre,map[c[i]]);
			cur = i-pre;
			len = Math.max(len,cur);
			map[c[i]] = i;
		}
		return len;
	}
}
