package Sort;
/** 
 * author: christ 
 * data：2016年3月14日 下午7:33:03 
 * 类说明 
 */
public class SelectionSort {//选择排序，每次找到剩下中的最小的然后和一个元素交换，时间复杂度O（n^2）
	public int[] selectionSort(int[] A,int n){
		int min = 0;
		int minj = 0;
		int temp = 0;
		for(int i = 0; i < n; i++){
			min = A[i];
			minj = i; //初始化minj
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
