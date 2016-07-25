package BATOffer;

/** 
 * author: christ 
 * data��2016��5��4�� ����7:42:49 
 * ����ظ��Ӵ�    ��һ�����飬����ÿһ���ַ���һ�γ��ֵ�λ�ã���ʼ��Ϊ-1�����ٴη��ʵ�����ַ���ʱ�򣬾ͻ���������е�ֵ
 * �õ�ǰ���ַ����е�λ�ã���ȥ��һ�γ��ֵ�λ�ã���ʱ���Ӵ��������ظ����Ӵ���Ȼ��������ڵ�ǰ���ȣ��͸���
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
