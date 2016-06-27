package Sort;
/** 
 * author: christ 
 * data：2016年4月20日 上午11:28:05 
 * 类说明 
 */
public class CountingSort {
	public int[] countingSort(int[] A,int n){
		int max = 0;
		for(int i = 0; i < A.length; i++){
			if(A[i] > max){
				max = A[i];
			}
		}
		int[] bucket = new int[max+1];
		for(int i = 0; i < A.length; i++){
			bucket[A[i]]++;
		}
		int count = 0;
		for(int i = 0; i < max+1; i++){
			for(int j = 0; j < bucket[i];j++){
				A[count++] = i;
			}
		}
		return A;
	}
	public static void main(String[] args){
		CountingSort cs = new CountingSort();
		int[] A = {99, 65, 24, 47, 50, 88,33, 66, 67, 31, 18};		
		int[] B  = cs.countingSort(A, 11);
		for(int i = 0; i < 11; i++){
			System.out.print(B[i]+" ");
		}
	}

}
