package MoguJie;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月20日 下午4:13:58 
 * 类说明 
 */
public class Main_Palindromic {
	public static void main(String[] args){
		Scanner in =  new Scanner(System.in);
		while(in.hasNext()){
			String s = in.nextLine();
			char[] arr = s.toCharArray();
			int n = arr.length;
			int flag = 0;
			int i = 0;
			int j = n-1;
			for(i = 0,j = n-1;i < j;i++,j--){
				if(arr[i] == arr[j]){
					continue;
				}else{
					if(flag == 0 && arr[i] == arr[j-1]){
						System.out.println("Y");
						j = j-1;
						flag = 1;
					}
					else if(flag == 0 && arr[i+1] == arr[j]){
						System.out.println("N");
						i = i+1;
						flag = 1;
					}else{
						System.out.println(arr[i]);
						System.out.println("S");
						break;
					}
				}
			}
			if(i == j+1 || i == j){				
				System.out.println("YES");												
			}else{
				System.out.println(i);
				System.out.println(j);
				System.out.println("NO");
			}
		}
		in.close();
	}

}
