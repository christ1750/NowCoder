package Qihu360;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月18日 上午10:12:43 
 * 360员工桂最近申请了一个长假，一个人背着包出去自助游了。
 * 路上，他经过了一个小镇，发现小镇的人们都围在一棵树下争吵。
 * 桂上前询问情况，得知小镇的人们正缺一个镇长，他们希望能选一个知名又公正的镇长，即，大家希望能选出一个人，
 * 所有人都认识他，但同时他不认识镇上除自己以外的其他人（在此，我们默认每个人自己认识自己）。
 * 可是小镇里的人太多了，一下子大家谁也说服不了谁。
 * “这简单啊。”桂表示。于是他一下子统计出来了镇上人们相互之间的认识关系，并且一下子找到了合适的镇长人选。
 * 现在你手上也拿到了这样一份认识关系的清单。其中上面给出的认识关系是单向的，
 * 即，A认识B与B认识A是相互独立的，只给出A认识B就不能认为B认识A，
 * 例如，我认识你，你不一定认识我。而且，这里的认识关系也不具有传递性，即，A认识B，B认识C，但这不代表A认识C。
 * 同时，为了方便处理，这份清单中，镇上的N个人依次编号为1到N。你能否像桂一样快速找到合适的镇长人选呢？ 
 */
public class Main_Capital {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();									
			for(int i = 0; i < n; i++){
				int per_num = in.nextInt();
				int count = in.nextInt();										
				int[][] relation = new int[count][2];
				for(int j = 0; j < per_num; j++){
					relation[j][0] = in.nextInt();
					relation[j][1] = in.nextInt();
				}
				isWho(per_num,count,relation);
			}
		}
		in.close();
	}
	public static void isWho(int n, int m, int[][] relation){
		int[] count = new int[n+1];
		for(int i = 0; i < m; i++){
			if(relation[i][0] != relation[i][1]){
				count[relation[i][1]]++;
			}
		}
		int f = 0;
		int k = 0;
		for(int i = 1; i <= n; i++){
			if(count[i] == n-1){
				f++;
				k = i;
			}
		}
		if(f == 1){
			System.out.println(1+"\n"+k);
		}else{
			System.out.println(0+"\n");
		}
	}

}
