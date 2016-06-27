package Sort;
/** 
 * author: christ 
 * data：2016年3月14日 下午8:57:15 
 * 类说明 
 */
public class ShellSort {
	public int[] shellSort(int[] A,int n){
		int step = n/2;
		int temp = 0;
		while(step >= 1){			
			for(int i = step; i < n; i++){
				int p = i;
				int j = i-step;
				while(p >= 0&&j >= 0){
					if(A[p] < A[j]){
						temp = A[p];
						A[p] = A[j];
						A[j] = temp;	
					}
					p = j;	
					j = j-step;
				}
			}
			step = step/2;
		}
		return A;
	}
	public static void main(String[] args){
		int[] A = {4,2,5,7,1,3,8,6};
		ShellSort ss = new ShellSort();
		int[] B = ss.shellSort(A, 8);
		for(int i = 0; i < 8; i++){
			System.out.println(B[i]);
		}		
	}
}
