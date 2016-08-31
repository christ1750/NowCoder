import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年8月25日 下午9:20:13 
 * 类说明 
 */
public class SQRT {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int temp = 0;
			int min = Integer.MAX_VALUE;
			int[] dp = new int[n+1];
			for(int i = 1; i <= n; i++){
				if(Math.sqrt(i)*Math.sqrt(i) == i){
					dp[i] = 1;
				}else{
					temp = (int) Math.sqrt(i);
					min = dp[i-1]+1;
					for(int j = 1; j < Math.sqrt(i); j++){
						if(min > dp[i-j*j]+1){
							min = dp[i-j*j]+1;
						}
					}
					dp[i] = min;
				}
			}
			System.out.println(dp[n]);
		}
		in.close();
	}

}
