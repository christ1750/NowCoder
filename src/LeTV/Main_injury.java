package LeTV;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月16日 上午11:08:52 
 * 赫柏在绝域之门击败鲁卡斯后，从鲁卡斯身上掉落了一本高级技能书，赫柏打开后惊喜地发现这是一个早已失传的上古技能---禁忌雷炎。
 * 该技能每次发动只需扣很少的精神值，而且输出也非常高。
 * 具体魔法描述如下：
 * 把地图抽象为一个二维坐标，技能发动者位于(0,0)位置。以技能发动者为中心，做一个半径为r的圆，满足r^2=S，如果敌人位于这个圆上，且位置为整点坐标，这个敌人将收到该技能的输出伤害。。 
 */
public class Main_injury {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int S = in.nextInt();
			double r = Math.sqrt(S);
			int num = 0;
			int j = 1;
			for(int i = (int) r; i >= 0; i--){				
				if(Math.pow(i,2)+Math.pow(r-i,2) == S){
					num++;
				}			
			}
			System.out.println(4*num);
		}
		in.close();
		
	}

}
