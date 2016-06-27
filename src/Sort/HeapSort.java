package Sort;
/** 
 * author: christ 
 * data：2016年4月20日 上午10:07:43 
 * 类说明 
 */
public class HeapSort {
	public int[] heapSort(int[] A,int n){
		int i = n-1;
		int temp = 0;
		while(i>0){
			heapAdjust(A,i);
			temp = A[0];
			A[0] = A[i];
			A[i] = temp;
			i--;
		}
		return A;
	}
	public void heapAdjust(int[] A,int i){		
		int temp = 0;
		for(int j = i/2;j >= 0; j--){
			if(2*j+1<=i){
				int k = A[2*j+1]>A[2*j]?2*j+1:2*j;
				if(A[k] > A[j]){
					temp = A[k];
					A[k] = A[j];
					A[j] = temp;
				}
			}else{
				int k = 2*j;
				if(A[k] > A[j]){
					temp = A[k];
					A[k] = A[j];
					A[j] = temp;
				}
			}
				
			
		}
	}
	public static void main(String[] args){
		int[] A = {4,2,5,7,1,3,8,6};
		HeapSort hs = new HeapSort();
		int[] B = hs.heapSort(A, 8);
		for(int i = 0; i < 8; i++){
			System.out.println(B[i]);
		}		
	}
}
