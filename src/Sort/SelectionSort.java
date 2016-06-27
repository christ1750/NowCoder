package Sort;
/** 
 * author: christ 
 * data��2016��3��14�� ����7:33:03 
 * ��˵�� 
 */
public class SelectionSort {//ѡ������ÿ���ҵ�ʣ���е���С��Ȼ���һ��Ԫ�ؽ�����ʱ�临�Ӷ�O��n^2��
	public int[] selectionSort(int[] A,int n){
		int min = 0;
		int minj = 0;
		int temp = 0;
		for(int i = 0; i < n; i++){
			min = A[i];
			minj = i; //��ʼ��minj
			for(int j = i; j < n; j++){
				if(A[j] < min){
					min = A[j];
					minj = j;
				}
			}
			temp = A[i];			
			A[minj] = temp;
			A[i] = min;
			
		}
		return A;
	}
	public static void main(String[] args){
		int[] A = {5,8,3,7,9,4,1,2,6};
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(A, 9);
		for(int i = 0; i < 9; i++){
			System.out.println(A[i]);
		}
		
	}

}
