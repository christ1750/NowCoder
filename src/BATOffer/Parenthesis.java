package BATOffer;
/** 
 * author: christ 
 * data：2016年5月2日 下午7:56:19 
 * 类说明 
 */
public class Parenthesis {
	public boolean chkParenthesis(String A,int n){
		char[] aa = A.toCharArray();
        int num = 0;
        for(int i = 0; i < n; i++){
            if(aa[i] == '('){
                num++;
            }
            if(aa[i] == ')'){
                num--;
            }
        }
        if(num == 0){
            return true;
        }
        return false;    
	}
	public static void main(String[] args){
		
	}
}
