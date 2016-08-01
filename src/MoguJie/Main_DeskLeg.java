package MoguJie;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月16日 下午4:00:24 
 * Arthur最近搬到了新的别墅，别墅特别大，原先的桌子显得比较小，
 * 所以他决定换一张新的桌子。他买了一张特别大的桌子，桌子是由很多条桌腿进行支撑的，
 * 可是回到家之后他发现桌子不稳，原来是桌子腿长度不太相同。
 * 他想要自己把桌子修理好，所以他决定移除掉一些桌腿来让桌子变得平稳。
 * 桌子腿总共有n条腿，第i条腿长度为li，Arthur移除第i桌腿要花费代价为di。
 * 假设k条腿桌子平稳的条件:超过一半桌腿能够达到桌腿长度的最大值。
 * 例如：一条腿的桌子是平稳的，两条腿的桌子腿一样长时是平稳的。
 * 请你帮Arthur计算一下是桌子变平稳的最小总代价。 
 * 
 * 
 *  6
 *  2 2 1 1 3 3
 *
 *  4 3 5 5 2 1
 *  
 * 
 *8
 */
public class Main_DeskLeg {
	public class desk{
		int len = 0;
		int cost = 0;
		public desk(int len, int cost){
			this.len = len;
			this.cost = cost;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();			
			int[] l = new int[n];
			int[] d = new int[n];
			for(int i = 0; i < n; i++){
				l[i] = in.nextInt();
			}
			for(int i = 0; i < n; i++){
				d[i] = in.nextInt();
			}			
		}
		in.close();
	}

}
