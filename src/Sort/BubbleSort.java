package Sort;
/** 
 * author: christ 
 * data��2016��3��14�� ����7:25:32 
 * ��˵�� 
 */


//ð������һ��һ���ȣ�ֻҪ��ľ����³�  ʱ�临�Ӷ�O��N^2��
public class BubbleSort {
	public int[] bubbleSort(int[] A,int n){
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j ++){
				int temp = 0;
				if(A[i] > A[j]){
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		return A;
	}
	public static void main(String[] args){
		int[] A = {5,8,3,7,9,4,1,2,6};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(A, 9);
		for(int i = 0; i < 9; i++){
			System.out.println(A[i]);
		}
		
	}

}
