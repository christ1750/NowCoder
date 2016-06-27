package Baidu;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月9日 下午5:07:30 
 * 类说明 
 */
public class Main_01 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			String[] p = new String[n];
			for(int i = 0; i < n; i++){
				p[i] = scan.next();
			}
			boolean b = true;
			for(int i = 0; i < n-1; i++){
				if(!p[i].substring(p[i].length()-1,p[i].length()).equals(p[i+1].substring(0,1))){
					b = false;
					break;
				}
				
			}
			if(b){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}

}
