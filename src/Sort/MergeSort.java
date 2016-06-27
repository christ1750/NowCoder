package Sort;
/** 
 * author: christ 
 * data：2016年4月20日 下午3:38:11 
 * 类说明 
 */
public class MergeSort {
	public int[] mergeSort(int[] A,int n){
		int mid = n/2;
		sort(A,0,mid);
		sort(A,mid+1,n-1);
		merge(A,0,n-1,mid);
		return A;
	}
	public void sort(int[] A,int l,int h){
		int mid = (h-l)/2;
		if(l<h){
			sort(A,l,l+mid);
			sort(A,l+mid+1,h);
			merge(A,l,h,mid);
		}
	}
	public void merge(int[] A,int l, int h, int mid){
		int temp[] = new int[h+l];
		int i = l;
		int j = l+mid+1;
		int count = 0;
		while(i <= l+mid && j <= h){
			if(A[i]<A[j]){
				temp[count++] = A[i];
				i++;
			}else{
				temp[count++] = A[j];
				j++;
			}
		}
		while(i <= l+mid){
			temp[count++] = A[i];
			i++;
		}
		while(j <= h){
			temp[count++] = A[j];
			j++;
		}
		for(int k = 0; k < count; k++){
			A[l++] = temp[k];
		}
	}
	public static void main(String[] args){
		int[] A = {4,2,5,7,1,3,8,6};
		MergeSort ms = new MergeSort();
		int[] B = ms.mergeSort(A, 8);
		for(int i = 0; i < 8; i++){
			System.out.println(B[i]);
		}
	}

}
