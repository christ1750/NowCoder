package BATOffer;
/** 
 * author: christ 
 * data：2016年5月2日 下午5:30:01 
 * 类说明 
 */
public class Transform {
	public boolean chkTransform(String A,int lena,String B,int lenb){
		if(lena != lenb){
			return false;
		}
		if(A == null || B == null){
			return false;
		}
		char[] chas1 = A.toCharArray();
		char[] chas2 = B.toCharArray();
		int[] map = new int[256];
		for(int i = 0; i < lena; i++){
			map[chas1[i]]++;
		}
		for(int i = 0; i < lenb; i++){
			if(map[chas2[i]]-- == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		
	}
	
}
