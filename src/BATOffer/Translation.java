package BATOffer;
/** 
 * author: christ 
 * data：2016年4月30日 下午5:53:12 
 * 类说明 
 */
public class Translation {
	public String stringTranslation(String A,int n, int len){
		char[] s = A.toCharArray();			
		rotate1(s,len);			
		return String.valueOf(s);
	}
	public void rotate1(char[] chas,int size){
		if(chas == null || size <= 0 || size >= chas.length){
			return;
		}
		reverse(chas,0,size - 1);
		reverse(chas,size,chas.length-1);
		reverse(chas,0,chas.length-1);
	}
	public void reverse(char[] chas,int start,int end){
		char temp = 0;
		while(start < end){
			temp = chas[start];
			chas[start] = chas[end];
			chas[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args){
		Translation ts = new Translation();
		String A = "RJXJYA";
		int n = 6;
		int len = 1;
		String res = ts.stringTranslation(A, n, len);
		System.out.println(res);
	}
}
