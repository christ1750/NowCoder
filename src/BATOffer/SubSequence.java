package BATOffer;
/** 
 * author: christ 
 * data：2016年4月29日 上午11:17:03 
 * 类说明 
 */
public class SubSequence {
	public int shortestSubsequence(int[] A,int n){
		int res = 0;
		int max = A[0];
		int min = A[n-1];
		int r = 0; 
		int l = 0;
		for(int i = 1; i < n; i++){
			if(A[i] > max){
				max = A[i];
			}else if(A[i] < max){
				r = i;
			}
			System.out.println(r);
		}
		for(int j = n-1; j > 0; j--){
			if(A[j] < min){
				min = A[j];
			}else if(A[j] > min){
				l = j;
			}
		}
		System.out.println(l);
		if(r-l == 0){
			return 0;
		}
		res = r-l+1;
		return res;
	}
	public static void main(String[] args){
		SubSequence ss = new SubSequence();
		int[] A = {1,4,6,5,9,10};
		int n = ss.shortestSubsequence(A, A.length);
		System.out.println(n);
	}
}
