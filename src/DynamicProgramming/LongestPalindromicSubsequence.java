package DynamicProgramming;
/** 
 * author: christ 
 * data：2016年5月18日 上午10:33:26 
 * 最长回文串的长度
 * 代码难懂的地方就是内层的两个for循环，他们分别对于以i为中心的长度为奇数和偶数的两种情况，整个代码遍历中心
 * 位置i，并以之扩展，找出最长回文
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
		if(res%2 == 0){//偶数，直接复制
			
		}else{//奇数，减1之后复制
			
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
