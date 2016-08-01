package Tencent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/** 
 * author: christ 
 * data��2016��6��9�� ����8:30:33 
 * ��n������������ɶ�Ԫ�飬��ľ���ֵ��С���ж��ٶ��أ���ľ���ֵ������
 */
public class Main_Gap {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()){
			int n = Integer.parseInt(in.nextLine());
			int[] arr = new int[n];	
			String[] s = in.nextLine().split(" ");
			for(int i = 0; i < n; i++){
				arr[i] = Integer.parseInt(s[i]);
			}			
			Arrays.sort(arr);
			int max = Math.abs(arr[arr.length-1]-arr[0]);
			int min = 99999;
			int max_num = 0;
			int min_num = 0;			
			for(int i = 0; i < n-1; i++){				
				if(Math.abs(arr[i] - arr[i+1]) < min){
					min = Math.abs(arr[i] - arr[i+1]);					
				}
				
			}
			for(int i = 0; i < n; i++){	
				for(int j = n-1; j > i; j--){
					if(Math.abs(arr[i] - arr[j]) == max){
						max_num++;
					}				
					else{
						break;
					}
				}
				
			}
			for(int i = 0; i < n; i++){	
				for(int j = i+1; j < n; j++){
					if(Math.abs(arr[i] - arr[j]) == min){
						min_num++;
					}				
					else{
						break;
					}
				}
				
			}
			System.out.print(min_num);
			System.out.print(" ");	
			System.out.println(max_num);
		}
	}

}
