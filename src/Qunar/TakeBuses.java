package Qunar;
/** 
 * author: christ 
 * data：2016年6月24日 上午9:16:07 
 * 类说明 
 */
public class TakeBuses {
	public int chooseLine(int[] stops, int[] period, int[] interval, int n, int s){
		int minTime = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			int constant = (1+stops[i])*5+stops[i]*period[i];
			int wait = s%interval[i];
			if(wait != 0){
				wait = interval[i]-wait;
			}
			int total = constant+wait+s;
			if(minTime > total){
				minTime = total;
			}
		}
		return minTime;
	}

}
