package LeTV;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月16日 上午10:21:56 
 * 在最近几场魔兽争霸赛中，赫柏对自己的表现都不满意。
 * 为了尽快提升战力，赫柏来到了雷鸣交易行并找到了幻兽师格丽，打算让格丽为自己的七阶幻兽升星。
 * 经过漫长的等待以后，幻兽顺利升到了满星，赫柏很满意，打算给格丽一些小费。
 * 赫柏给小费是有原则的：
 * 1.最终给格丽的钱必须是5的倍数；
 * 2.小费必须占最终支付费用的5%~10%之间（包含边界）。
 * 升星总共耗费A魔卡，赫柏身上带了B魔卡，赫柏想知道他有多少种支付方案可供选择。
 * 注：魔卡是一种货币单位，最终支付费用=本该支付的+小费
 *
 */
public class Main_Raise {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int A = in.nextInt();
			int B = in.nextInt();			
			int count = 0;
			int lower = (int) Math.floor(A+A*0.05) ;
			int upper = Math.min((int) (A+A*0.1), B);
			for(int i = lower; i < upper; i++){
				if(i%5 == 0){
					lower = i;
					break;
				}
			}			
			count = (upper-lower)/5+1;
			System.out.println(count);
			
		}
		in.close();
	}

}
