package BATOffer;

import java.util.Random;

/** 
 * author: christ 
 * data��2016��5��11�� ����8:36:10 
 * ��˵�� 
 */
/*����ȸ��ʵĴ�ӡarr�е�M����
 * �������һ������Ȼ���ӡ�����������������������һ��Ԫ��N-1����
 * ���ҽ�����ĳ����޸�ΪN-1��
 * �����ظ�������̣�ֱ����ӡ��M����
 * */
public class RandomPrint {
	public int[] print(int[] arr,int N,int M){
		int[] res = new int[N];
		Random r = new Random();
		int temp = 0;
		for(int i = 0; i < M;i++){
			int num = r.nextInt(N-1);
			temp = arr[num];
			arr[num] = arr[N-1];
			arr[N-1] = temp;			
			N--;
			res[i] = arr[num];
			System.out.println(res[i]);
		}
		return res;
	}
	public static void main(String[] args){
		RandomPrint rp = new RandomPrint();
		int[] arr = {29,24,17,1,3,11,8,19,12,15,10,28,20,18,2,26,14,7,22,27,23,5,6,9,21,16,25,4,13};
		arr = rp.print(arr, 29, 10);		
	}
}
