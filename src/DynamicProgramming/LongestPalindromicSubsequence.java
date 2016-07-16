package DynamicProgramming;
/** 
 * author: christ 
 * data��2016��5��18�� ����10:33:26 
 * ����Ĵ��ĳ���
 * �����Ѷ��ĵط������ڲ������forѭ�������Ƿֱ������iΪ���ĵĳ���Ϊ������ż����������������������������
 * λ��i������֮��չ���ҳ������
 */
public class LongestPalindromicSubsequence {
	public int getLPS(String A,int n){
		int res = 0;
		int[][] dp = new int[n][n];			
		for(int i = 0; i < n; i++){
			dp[i][i] = 1;
		}
		for(int i = n-1; i >= 0; i--){			
			for(int j = i+1; j < n; j++){
				if(A.charAt(i) == A.charAt(j)){
					dp[i][j] = 2 + dp[i+1][j-1];					
				}
				else{
					dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
				}				
			}
		}
		res = dp[0][n-1];
		char[] palindromic = new char[res];
		int row = 0;
		int column = n-1;
		int i = 0;								
		while (row != column) {
			if (A.charAt(row) == A.charAt(column)) {
				palindromic[i] = A.charAt(row);
				row++;
				column--;
				System.out.println(palindromic[i]);
				i++;
				continue;
			}
			if (dp[row][column - 1] > dp[row + 1][column]) {
				column = column - 1;
			} else {
				row = row + 1;
			}						
		}
		if(res%2 == 0){//ż����ֱ�Ӹ���
			
		}else{//��������1֮����
			
		}
		int j = i;
		for(; i < res; i++){
			palindromic[i] = palindromic[j--];
			System.out.println(palindromic[i]);
		}
		return res;
	}
	public static void main(String[] args){
		LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
		String A = "BBCABB";
		int ss = lps.getLPS(A, A.length());
		System.out.println(ss);
	}
}
