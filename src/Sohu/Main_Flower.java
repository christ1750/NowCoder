package Sohu;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月21日 下午3:51:08 
 * 类说明 
 */
public class Main_Flower {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while(in.hasNext()){
			String t1 = in.next();
			String t2 = in.next();
			int[] p1 = new int[3];
			int[] p2 = new int[3];
			boolean z1 = change(p1,t1);
			boolean z2 = change(p2,t2);
			if(!z1 && !z2){
				System.out.println(-2);
			}else{
				System.out.println(banduan(p1,p2));
			}
		}									
	}
	public static boolean change(int[] p,String t){
		boolean z = true;
		int j = 0;
		for(int i = 0; i < t.length(); i++){
			switch(t.substring(i, i+1)){
			case"1":p[j] = 10;j++;i++;break;
			case"2":p[j] = 2;j++;break;
			case"3":p[j] = 3;j++;break;
			case"4":p[j] = 4;j++;break;
			case"5":p[j] = 5;j++;break;
			case"6":p[j] = 6;j++;break;
			case"7":p[j] = 7;j++;break;
			case"8":p[j] = 8;j++;break;
			case"9":p[j] = 9;j++;break;
			case"J":p[j] = 11;j++;break;
			case"Q":p[j] = 12;j++;break;
			case"K":p[j] = 13;j++;break;
			case"A":p[j] = 14;j++;break;
			default:z = false;break;
			}
		}
		if(z == true){
			for(int i = p.length-1; i >=0; i--){
				for(int k = 0; k<i; k++){
					if(p[k]>p[k+1]){
						int temp = p[k];
						p[k] = p[k+1];
						p[k+1] = temp;
					}
				}
			}
		}
		return z;
	}
	public static int banduan(int[] p1, int[] p2){
		int result = -2;
		int[] tr = new int[3];
		int b1 = pai(p1);
		int b2 = pai(p2);
		if(b1 == b2){
			switch(b1){
			case 3:
				if(p1[0] == p2[0]){
					result = 0;
				}else{
					result = b1>b2?1:-1;
				}
				break;
			case 2:
				if(p1[0] == p2[0]){
					result = 0;
				}else{
					result = b1>b2?1:-1;
				}
				break;
			case 1:
				if(p1[1] == p2[0]){
					if(p1[0] == p2[0]){
						if(p1[0] == p1[1]){
							if(p1[2] == p2[2]){
								result = 0;
							}else{
								result = p1[2]>p2[2]?1:-1;
							}
						}else{
							result = 0;
						}
					}else{
						if(p1[0] < p1[1]){
							result = -1;
						}else{
							result = 1;
						}
					}
				}else{
					result = p1[1]>p2[1]?1:-1;
				}
				break;
			case 0:
				for(int i = p1.length-1; i >=0; i--){
					if(p1[i] == p2[i]){
						continue;
					}else{
						result = p1[i]>p2[i]?1:-1;
						break;
					}
				}
				if(result == -2){
					result = 0;
				}break;
				default:break;
			}
			
				
		}else{
			result = b1>b2?1:-1;
		}
		return result;
	}
	public static int pai(int[] p){
		if(p[0] == p[1] && p[1] == p[2]){
			return 3;
		}else if(p[0] == p[1]||p[0]==p[2]||p[1]==p[2]){
			return 1;
		}else if(p[1]==(p[0]+1)&&p[2]==(p[1]+1)){
			return 2;
		}else{
			return 0;
		}
	}

}
