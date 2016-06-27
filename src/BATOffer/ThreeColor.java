package BATOffer;
/** 
 * author: christ 
 * data：2016年4月29日 上午10:54:03 
 * 类说明 
 */
public class ThreeColor {
	public int[] sortThreeColor(int[] A,int n){
		int left = -1;
		int right = A.length;
		int i = 0;
		/*
		 * 分为三种情况
		 * 分为两个空间：
		 * 	为0的元素全部调整到前面，即left指针对应的空间，left和i互换
		 * 	为2的元素，全部调整到后面，即right指针对应的空间，right和i互换
		 * 	为1的元素不变，i++即可
		 */
		while(i < right){			
			if (A[i] == 0) {
				swap(A, ++left, i);
				i++;
			} else if (A[i] == 2) {
				swap(A, i, --right);
			} else {
				i++;
			}						
		}
		return A;
	}
	public void swap(int[] A,int i,int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	public static void main(String[] args){
		ThreeColor tc = new ThreeColor();
		int[] A = {0,1,1,0,2,2,2};
		int[] B = tc.sortThreeColor(A, 7);
		for(int i = 0; i < A.length; i++){
			System.out.print(B[i]+" ");
		}
	}
}
