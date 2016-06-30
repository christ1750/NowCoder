package BATOffer;

import java.util.LinkedList;

/** 
 * author: christ 
 * data��2016��6��14�� ����3:40:07 
 * ��˵�� 
 */
public class SlideWindow {
	public int[] slide(int[] arr, int n, int w){
		if(arr == null || arr.length == 0){
			return arr;
		}
		int[] res = new int[n-w+1];
		int index = 0;
		LinkedList<Integer> qmax = new LinkedList<>();
		for(int i = 0; i < n; i++){
			while(!qmax.isEmpty() && arr[qmax.peekLast()]<=arr[i]){
				qmax.pollLast();
			}
			qmax.addLast(i);                 //�Ӷ�β��������Ԫ��ʱ�ж�
			if(qmax.peekFirst() == i-w){     //�Ӷ�ͷɾ��Ԫ���ж�
				qmax.pollFirst();
			}
			if(i >= w-1){
				res[index++] = arr[qmax.peekFirst()];
			}
		}
		return res;
	}

}
