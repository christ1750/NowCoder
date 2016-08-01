package Tencent;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月9日 下午8:01:33 
 * 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。
 * 如何删除才能使得回文串最长呢 
 */
public class Main_Palindromic {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String ss = in.nextLine();
			char[] arr = ss.toCharArray();
			int[][] dp = new int[arr.length][arr.length];
			for(int j = 1; j < arr.length; j++){
				dp[j-1][j] = arr[j-1]==arr[j]?0:1;
				for(int i = j-2; i > -1; i--){
					if(arr[i] == arr[j]){
						dp[i][j] = dp[i+1][j-1];
					}
					else{
						dp[i][j] = Math.min(dp[i+1][j], dp[i][j-1])+1;
					}
				}
			}
			System.out.println(dp[0][arr.length-1]);
		}
	}

}
