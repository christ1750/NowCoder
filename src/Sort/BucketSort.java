package Sort;
/** 
 * author: christ 
 * data��2016��4��27�� ����4:03:13 
 * ��˵�� 
 */
//Ͱ�����������n������ǰ���������ĳ��ȣ����Ǵ��������������Ԫ�ص�ֵ
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
		int[] C = bs.bucketSort(A, 99); //�˴�n = 99  ��A������Ԫ��
		for(int i = 0; i < C.length; i++){
			if(C[i] > 0){   //�����ʱ��һ��Ҫע��ֻ��������ֵ�Ԫ�ء�
				System.out.println(C[i]);
			}
		}
	}

}
