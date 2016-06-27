package wangyi;
/** 
 * author: christ 
 * data：2016年6月12日 下午1:19:37 
 * 类说明 
 */
public class Finder {
	public int findKth(int[] a, int n, int K){
		int i = 0;
		int j = n-1;
		int tmp = a[0];
		K = n-K+1;
		return f(a,0,n,K);
	}
	private int f(int[] a,int m, int n, int K){
		int i = m;
		int j = n-1;
		int tmp = a[i];
		while(i < j){
			while(i<j&&a[j]>= tmp){
				j--;
			}
			if(i<j){
				a[j] = a[i];
			}
		}
		a[i] = tmp;
		if(i-m+1 == K){
			return a[i];
		}else{
			if(i-m+1<K){
				return f(a,i+1,n,K-i+m-1);
			}else{
				return f(a,m,i,K);
			}
		}
	}				
}


