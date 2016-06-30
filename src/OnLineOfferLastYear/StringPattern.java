package OnLineOfferLastYear;
/** 
 * author: christ 
 * data：2016年6月30日 下午3:30:39 
 * 类说明 
 */
public class StringPattern {
	public int findAppearance(String A, int lena, String B, int lenb){
		int res = 0;		
		int[] next = new int[B.length()];
		next[0] = 0;
		for(int i = 1, j = 0; i < B.length(); i++){
			while(j>0 && B.charAt(j)!=B.charAt(i)){
				j = next[j-1];
			}
			if(B.charAt(i) == B.charAt(j)){
				j++;
			}
			next[i] = j;
		}
		for(int i = 0, j = 0; i < A.length(); i++){
			while(j>0 && A.charAt(i)!=B.charAt(j)){
				j = next[j-1];
			}
			if(A.charAt(i) == B.charAt(j)){
				j++;
			}
			if(j == B.length()){
				res = i-j+1;
				break;
			}
		}
		return res;
	}

}
