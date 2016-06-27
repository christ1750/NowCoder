package BATOffer;
/** 
 * author: christ 
 * data：2016年5月2日 下午5:59:23 
 * 类说明 
 */
public class Reverse {
	public String reverseSentence(String A,int n){
		if(A == null || n <= 0){
			return null;
		}
		char[] arr1 = A.toCharArray();
		String res = rotate(arr1);
		return res;		
		
	}
	public String rotate(char[] A){
		if(A == null || A.length <= 0){
			return null;
		}
		int index = 0;
		int j = A.length-1;
		reverse1(A,index,j);
		for(int i = 0; i < A.length; i++){			
			if(A[i] == ' '){
				j = i-1;
				reverse1(A,index,j);
				index = i+1;
			}
			if(i == A.length - 1){
				j = i;
				reverse1(A,index,j);
			}
		}
		String res = String.valueOf(A);
		return res;
		
	}
	public void reverse1(char[] A, int start,int end){
		char temp = 0;
		while(start < end){
			temp = A[start];
			A[start] = A[end];
			A[end] = temp;	
			start++;
			end--;
		}
		
	}
	public static void main(String[] args){
		Reverse rs = new Reverse();
		String A = "dog loves pig";
		String ss = rs.reverseSentence(A, 13);
		System.out.println(ss);
	}
}
