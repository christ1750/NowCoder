package Sort;
/** 
 * author: christ 
 * data��2016��3��14�� ����8:15:29 
 * ��˵�� 
 */
public class InsertionSort {//��������
	public int[] insertionSort(int[] A,int n){
		int i = 0;
		int j = 0;
		int temp = 0;
		for(i = 1; i < n; i++){
			temp = A[i];
			for(j = i; j > 0 && A[j-1] > temp; j--){
				A[j] = A[j-1];
			}
			A[j] = temp;
			
		}
		return A;
	}
	public static void main(String[] args){
		int[] A = {5,8,3,7,9,4,1,2,6};
		InsertionSort it = new InsertionSort();
		it.insertionSort(A, 9);
		for(int i = 0; i < 9; i++){
			System.out.println(A[i]);
		}
	}

}
