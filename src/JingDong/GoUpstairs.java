package JingDong;
/** 
 * author: christ 
 * data：2016年6月22日 下午8:58:40 
 * 类说明 
 */
public class GoUpstairs {
	public int countWays_1(int n){
		if(n == 1){
			return 1;
		}
		else if(n == 2){
			return 1;
		}
		else{
			return countWays_1(n-1)+countWays_1(n-2);
		}
	}
	public static void main(String[] args){
		GoUpstairs gu = new GoUpstairs();
		int res = gu.countWays_1(5);
		System.out.println(res);
	}
	public int countWays_2(int n){
		int res[] = {0,1};
		if(n < 2){
			return res[n];
		}
		int num1 = 1;
		int num2 = 0;
		int num = 0;
		for(int i = 2; i <= n; i++){
			num = (num1+num2)%1000000007;
			num2 = num1;
			num1 = num;
		}
		return num;
	}

}
