package JingDong;
/** 
 * author: christ 
 * data��2016��6��19�� ����5:05:07 
 * ��˵�� 
 */
public class Bonus {
	public int getMost(int[][] board){
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				if(i == 0&&j == 0){
					board[i][j] = board[i][j];
				}else if(i == 0){
					board[i][j] = board[i][j]+board[i][j-1];
				}else if(j == 0){
					board[i][j] = board[i][j]+board[i-1][j];
				}else{
					if(board[i-1][j] > board[i][j-1]){
						board[i][j] = board[i-1][j]+board[i][j];
					}else{
						board[i][j] = board[i][j-1]+board[i][j];
					}
				}
			}
		}
		return board[5][5];
	}

}
