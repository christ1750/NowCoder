package MeiTuan;
/** 
 * author: christ 
 * data：2016年6月28日 下午4:08:39 
 * 类说明 
 */
public class Flip {
	public int[][] flipChess(int[][] A, int[][] f){
		int len = f.length;
		for(int i = 0; i < len; i++){
			int row = f[i][0]-1;
			int col = f[i][1]-1;
			if(row-1>=0){
				A[row-1][col] = (A[row-1][col] == 0)?1:0;				
			}
			if(row+1 <= 3){
				A[row+1][col] = (A[row+1][col] == 0)?1:0;
			}
			if(col-1>=0){
				A[row][col-1] = (A[row][col-1] == 0)?1:0;
			}
			if(col+1<=3){
				A[row][col+1] = (A[row][col+1] == 0)?1:0;
			}
		}
		return A;
	}

}
