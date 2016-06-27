package Sort;
/** 
 * author: christ 
 * data：2016年4月20日 下午4:02:55 
 * 类说明 
 */
public class QuickSort {
	public int[] quickSort(int[] A,int n){
		int p = 0;
		if(n <= 1){
			return A;
		}
		p = partition(A,0,n-1);
		sort(A,0,p-1);
		sort(A,p+1,n-1);
		return A;
	}
	public int partition(int[] A,int low,int high){
		int temp = A[low];
		int i = low;
		int j = high;
		int p = low;
		while(i < j){
			while(A[j]>=temp&&j>i){
				j--;
			}
				A[p] = A[j];
				p = j;
			
			while(A[i]<temp&&i<j){
				i++;
			}
				A[p] = A[i];
				p = i;
			
		}
		A[i] = temp;		
		return i;
	}
	public void sort(int[] A,int low,int high){
		int p = 0;
		if(low < high){
			p = partition(A,low,high);
			sort(A,low,p-1);
			sort(A,p+1,high);
		}
	}
	public static void main(String[] args){
		int[] A = {4,2,5,7,1,3,8,6};
		QuickSort qs = new QuickSort();
		int[] B = qs.quickSort(A, 8);
		for(int i = 0; i < 8; i++){
			System.out.println(B[i]);
		}
	}

}
