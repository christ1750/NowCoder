package Sort;

import java.util.ArrayList;

/** 
 * author: christ 
 * data：2016年4月20日 下午5:00:48 
 * 类说明 
 */
public class RedixSort {
	public int[] redixSort(int[] A,int n){
		for(int i = 0; i<4; i++){
			sort(A,i);
		}
		return A;
	}
	public void sort(int[] A,int i){
		ArrayList<ArrayList<Integer>> B = new ArrayList<>();
		for(int j = 0; j<10; j++){
			B.add(new ArrayList<Integer>());
		}
		for(int j = 0; j < A.length; j++){
			int temp = A[j];
			for(int k = 0; k < i; k++){
				temp = temp/10;
			}
			B.get(temp%10).add(A[j]);
		}
		int count = 0;
		for(int j = 0; j < 10; j++){
			for(int k = 0; k < B.get(j).size(); k++){
				A[count++] = B.get(j).get(k);
			}
		}
	}
	public static void main(String[] args){
		RedixSort rs = new RedixSort();
		int[] A = {4,2,5,7,1,3,8,6};
		int[] B = rs.redixSort(A, 8);
		for(int i = 0; i < 8; i++){
			System.out.println(B[i]);
		}
	}

}
