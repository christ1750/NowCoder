package MoguJie;

import java.util.Scanner;

/** 
 * author: christ 
 * data��2016��6��16�� ����4:03:28 
 * ����һ��n�����������У���Ҫ���ľ��ǽ�����������λ��ֱ���������а����������У���ô��������������ź�����Ҫ�������ٴΣ�
 * ���磬1��2��3��5��4������ֻ��Ҫ����һ�Σ�����5��4�������ɡ�
 *
 */
public class Main_SpecialExchange {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i <n; i++){
				arr[i] = in.nextInt();
			}
			int num = 0;
			for(int i = 0; i < n; i++){
				for(int j = i; j < n; j++){
					if(arr[i] > arr[j]){
						num++;
					}
				}
			}
			System.out.println(num);
			
		}
		in.close();
		
	}

}
