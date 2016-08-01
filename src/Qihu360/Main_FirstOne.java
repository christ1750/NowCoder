package Qihu360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月18日 上午10:04:51 
 * author: christ 
 * data：2016年7月29日 下午8:39:25 
 * 正在挑战一个CrackMe的你，把需要填写的前面几位密码都正确猜出了，可是这最后一位密码，好像藏得有点深。
 * CrackMe的作者还挑衅般的在里面藏了个.tar.gz文件，解压缩出来，里面写道
 * 你要的最后一个字符就在下面这个字符串里，这个字符是下面整个字符串中第一个只出现一次的字符。
 *（比如，串是abaccdeff，那么正确字符就是b了） 然而下面给出来的字符串好像太长太长了，单靠人力完全无法找出来。
 * 于是，你需要写一个程序代劳了。
 * 
 * 2
 * abaccdeff
 * testonline
 * 
 * b
 * s
 */
public class Main_FirstOne {
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
