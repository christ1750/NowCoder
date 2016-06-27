package Sort;
/** 
 * author: christ 
 * data：2016年4月27日 下午4:03:13 
 * 类说明 
 */
//桶排序的问题是n不是以前代表的数组的长度，而是待排序数组中最大元素的值
public class BucketSort {
	public int[] bucketSort(int[] A,int n){
		int[] B = new int[n+1];
		for(int i = 0; i < A.length; i++){
			B[A[i]] = A[i];
		}
		return B;
	}
	public static void main(String[] args){
		int[] A = {99, 65, 24, 47, 50, 88,33, 66, 67, 31, 18};
		BucketSort bs = new BucketSort();
		int[] C = bs.bucketSort(A, 99); //此处n = 99  是A中最大的元素
		for(int i = 0; i < C.length; i++){
			if(C[i] > 0){   //输出的时候一定要注意只输出有数字的元素。
				System.out.println(C[i]);
			}
		}
	}

}
