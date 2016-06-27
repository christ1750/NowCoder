package DynamicProgramming;
/** 
 * author: christ 
 * data：2016年6月11日 下午3:30:44 
 * 类说明 
 */
public class WildMatch {
	public boolean chkWildMatch(String A, int lena, String B, int lenb){
		char a[] = A.toCharArray();
		char b[] = B.toCharArray();
		if(b[0] != a[0] && b[0] != '.'){
			return false;
		}
		int j = 1;
		for(int i = 1; i < a.length; i++){
			if(a[i] == b[j] || b[j] == '.'){
				j++;
				continue;
			}else if((b[j-1] == '*'&&b[j-2] == '.')||(b[j] == '*'&&b[j-1] == '.')||b[j]!='*'||b[j-1]!='*'){
				
			}else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		WildMatch wm = new WildMatch();
		boolean b = wm.chkWildMatch("abcd", 4, ".*", 2);
		System.out.println(b);
	}

}
