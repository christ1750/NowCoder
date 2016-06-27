package BATOffer;

import java.util.Random;

/** 
 * author: christ 
 * data：2016年5月11日 上午8:36:10 
 * 类说明 
 */
/*随机等概率的打印arr中的M个数
 * 随机产生一个数，然后打印出来，并将他和数组中最后一个元素N-1交换
 * 并且将数组的长度修改为N-1，
 * 不断重复这个过程，直到打印出M个数
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
