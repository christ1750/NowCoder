package TouTiao;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月12日 下午3:04:29 
 * 你作为一名出道的歌手终于要出自己的第一份专辑了，
 * 你计划收录 n 首歌而且每首歌的长度都是 s 秒，
 * 每首歌必须完整地收录于一张 CD 当中。
 * 每张 CD 的容量长度都是 L 秒，而且你至少得保证同一张 CD 内相邻两首歌中间至少要隔 1 秒。
 * 为了辟邪，你决定任意一张 CD 内的歌数不能被 13 这个数字整除，那么请问你出这张专辑至少需要多少张 CD ？
 */
public class Main_05 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		int L = in.nextInt();
		int count = (L+1)/(s+1);
		count = Math.min(count, n);			
		if(count%13 == 0){
			count--;
		}
		int num = n/count;
		int last = (L+1)%(s+1);	
		if(last != 0){
			num++;
			if(last%13 == 0 && (count-last) == 1){
				num++;
			}
		}				
		System.out.println(num);		
		in.close();
	}	
}
