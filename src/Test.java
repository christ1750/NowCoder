

/** 
 * author: christ 
 * data：2016年6月6日 下午8:00:13 
 * 类说明
 * 最长无重复子串 
 */
public class Test
{
	public int longestSubstring(String A, int n){
		if(A == null || n == 0){
			return 0;
		}
		char[] c = A.toCharArray();
		int[] map = new int[256];
		int cur = 0;
		int pre = -1;
		int len = 0;
		for(int i = 0; i < 256; i++){
			map[i] = -1;
		}
		for(int i = 0; i < n; i++){
			pre = Math.max(pre, map[c[i]]);
			cur = i-pre;
			len = Math.max(len, cur);
			map[c[i]] = i;			
		}
		return len;
	}
    public static void main(String[] args)
    {
        Test tt = new Test();
        String A = "kojypxtmcheuvhpkqapldlkxkdbbouclkqwpnivxquwimbexyuqlipqpnlaklsqjnhcqspegqswpwinmvaokwbzylyrctfiscjuweakmmiaqsuanrfxhaffeuaauafqkeksjxgdpspkzzzsawuyvrdbgdqhrnkspldkkqfmlsofadojwfdikwpzsafacxoktpxkzmzzihljiqlsnbygkstydeflbgjrzrtxryfcntduaadqyzxmsrrxqbgldcvmtmqwyqgjtda";
        int n = tt.longestSubstring(A, 266);
        System.out.println(n);        
    }
}
