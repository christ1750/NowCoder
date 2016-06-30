package BATOffer;

/** 
 * author: christ 
 * data：2016年6月14日 下午3:03:53 
 * 类说明 
 */
public class StackReverse {
	public int[] reverseStack(int[] A, int n){
		if(n == 0){
			return A;
		}else{
			int cur = getStackBottom(A, n);
			n--;
			reverseStack(A, n);
			A[n] = cur;
			return A;
		}		
	}
	public int getStackBottom(int[] A, int n){
		int result = A[n-1];
		n--;
		if(n == 0){
			return result;
		}
		else{
			int cur = getStackBottom(A, n);
			A[n-1] = result;
			return cur;
		}
	}
}
