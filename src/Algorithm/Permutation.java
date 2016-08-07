package Algorithm;

/** 
 * author: christ 
 * data��2016��7��16�� ����3:14:38 
 * дһ��ȫ����,abc��ȫ����Ϊabc��acb,bca,bac,cab,cba
 * ˼·��ȫ���о��Ǵӵ�һ��������ÿ�����ֱַ�������������ֽ������ҵ�������ɺ󣬵ݹ�Ĵ���ͺ�����д������
 * �ؼ�����������֪����һ���������������������Ե�����������һ������ͬʱ����ô�ͻ����ظ�����122�����ԣ����
 * ��һ�����������ͬʱ�����ǾͲ�Ҫ���н����ˣ����ԣ�ȫ���е�ȥ�ع��򣬾��ǵ�һ��������ÿ����û������������ظ���
 * �ֵ����ֽ�����
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