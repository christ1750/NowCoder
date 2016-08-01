package BATOffer;
/** 
 * author: christ 
 * data：2016年7月27日 下午3:01:12 
 * 假设有n对左右括号，请求出合法的排列有多少个？合法是指每一个括号都可以找到与之配对的括号，比如n=1时，()是合法的，但是)(为不合法。
 *给定一个整数n，请返回所求的合法排列数。保证结果在int范围内。
 *传说中的卡特兰数
 *
 *2n个人排队买票，n个人拿5块钱，n个人拿10块钱，票价是5块钱1张，
 *每个人买一张票，售票员手里没有零钱，问有多少种排队方法让售票员可以顺利卖票。
 *
 *n个数进出栈的顺序有多少种？假设栈的容量无限大
 *
 *
 *求n个无差别的节点构成的二叉树有多少种不同的结构
 *
 *C(2n,n)/(2*n+1) (公式)
 *h(n)=h(n-1)*(4*n-2)/(n+1);  (递推关系)
 */
public class Parenthesis1 {
	public int countLegalWays(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		else{
			return countLegalWays(n-1)*(4*n-2)/(n+1);
		}
	}
	public int countLegalWays1(int n){
		int a = 1;
		int b = 1;
		//求组合数的方式，用两个变量，计数，同时乘以i次
		for(int i = 1; i <= n; i++){
			a *=(n+i);
			b *=i;
		}
		return a/(b*(n+1));
		
	}
	public static void main(String[] args){
		Parenthesis1 pt = new Parenthesis1();
		int a = pt.countLegalWays1(4);
		System.out.println(a);
	}
}
