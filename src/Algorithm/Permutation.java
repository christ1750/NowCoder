package Algorithm;

/** 
 * author: christ 
 * data：2016年7月16日 下午3:14:38 
 * 写一个全排列,abc的全排列为abc，acb,bca,bac,cab,cba
 * 思路：全排列就是从第一个数字起，每个数字分别与它后面的数字交换，找到这个规律后，递归的代码就很容易写出来了
 * 关键：由于我们知道第一个数与后面的数交换，所以当后面的数与第一个数相同时，那么就会有重复，如122，所以，如果
 * 第一个数与后面相同时，我们就不要进行交换了，所以，全排列的去重规则，就是第一个数字起，每个数没别与它后面非重复出
 * 现的数字交换。
 */
public class Permutation {
	static int k = 0;
	public String getPermutation(int n){
		int[] arr = new int[n];		
		for(int i = 1; i <= n; i++){
			arr[i-1] = i;
		}
		String sb = permutation(arr,k,arr.length);
		return sb;
	}
	public static String permutation(int[] c, int k, int size){
		StringBuffer sb = new StringBuffer();
		if(k == size){
			for(int i = 0; i < size; i++){
				sb.append(c[i]);				
			}			
			return sb.toString();
		}else{
			for(int i = k; i < size; i++){
				swap(c,i,k);
				permutation(c,k+1,size);
				swap(c,k,i);
			}
			return null;
		}
	}
	public static void swap(int[] cs, int i, int j){
		int temp = cs[i];
		cs[i] = cs[j];
		cs[j] = temp;
	}
	public static void main(String[] args){
		Permutation pt = new Permutation();
		pt.getPermutation(10);
	}
}