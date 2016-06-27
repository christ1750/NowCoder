package BATOffer;
/** 
 * author: christ 
 * data��2016��4��29�� ����10:54:03 
 * ��˵�� 
 */
public class ThreeColor {
	public int[] sortThreeColor(int[] A,int n){
		int left = -1;
		int right = A.length;
		int i = 0;
		/*
		 * ��Ϊ�������
		 * ��Ϊ�����ռ䣺
		 * 	Ϊ0��Ԫ��ȫ��������ǰ�棬��leftָ���Ӧ�Ŀռ䣬left��i����
		 * 	Ϊ2��Ԫ�أ�ȫ�����������棬��rightָ���Ӧ�Ŀռ䣬right��i����
		 * 	Ϊ1��Ԫ�ز��䣬i++����
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
