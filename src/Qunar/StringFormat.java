package Qunar;
/** 
 * author: christ 
 * data：2016年6月24日 上午11:29:09 
 * 类说明 
 */
public class StringFormat {
	public String formatString(String A, int n, char[] arg, int m){
		int index = 0;	
		int count = 0;
		while((index = A.indexOf("%s")) != -1){
			System.out.println(index);
			A = A.substring(0,index)+arg[count++]+A.substring(index+2,A.length());
		}
		if(count<arg.length){
			for(int i = count; i < arg.length; i++){
				A = A+arg[i];
			}
		}
		return A;
	}
	public static void main(String[] args){
		String A = "A%sC%sE";
		int n = 7;
		char[] arg = {'B','D','F'};
		int m = 3;
		StringFormat sf = new StringFormat();
		String s = sf.formatString(A, n, arg, m);
		System.out.println(s);
	}
}
