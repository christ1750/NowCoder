package BATOffer;

/** 
 * author: christ 
 * data：2016年5月4日 下午7:42:49 
 * 最长无重复子串    开一个数组，保存每一个字符上一次出现的位置，初始化为-1，当再次访问到这个字符的时候，就会更新数组中的值
 * 用当前在字符串中的位置，减去上一次出现的位置，此时的子串就是无重复的子串，然后如果大于当前长度，就更新
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
