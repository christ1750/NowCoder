package Qihu360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月18日 上午10:04:51 
 * 类说明 
 */
public class Main_01 {
	public static void main(String[] args){
		int T = 0;
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try{
			T = Integer.parseInt(b.readLine());
			for(int i = 0; i < T; i++){
				String str = b.readLine();
				System.out.println(first(str));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static char first(String s){
		int a = 0x21;
		int hash[] = new int[94];
		for(int i = 0; i < s.length(); i++){
			hash[s.charAt(i)-a]++;
		}
		for(int i = 0; i < s.length(); i++){
			if(hash[s.charAt(i)-a] == 1){
				return s.charAt(i);
			}
		}
		return '0';
	}

}
