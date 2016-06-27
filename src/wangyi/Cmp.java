package wangyi;
/** 
 * author: christ 
 * data：2016年6月12日 下午1:18:13 
 * 类说明 
 */
public class Cmp {
	public int cmp(int g1, int g2, int[][] records, int n){
		int max = records[0][0];
		for(int i = 0; i< n; i++){
			max = Math.max(max, records[i][0]);
			max = Math.max(max, records[i][1]);
		}
		
		int[][] arr = new int[max][max];
		for(int i = 0; i < n; i++){
			arr[records[i][0]][records[i][1]] = 1;
		}
		for(int k = 1; k <= max; k++){
			for(int i = 1; i <= max; i++){
				for(int j = 1; j <= max; j++){
					if(arr[i][k]>0 && arr[k][j]>0){
						arr[i][j] = arr[i][k]+arr[k][j];
					}
				}
			}
		}
		if(arr[g1][g2] > 0){
			return 1;
		}else if(arr[g2][g1] < 0){
			return -1;
		}else{
			return 0;
		}
	}

}
