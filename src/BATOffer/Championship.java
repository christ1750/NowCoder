package BATOffer;
/** 
 * author: christ 
 * data：2016年5月10日 下午5:08:41 
 * 类说明 
 */
public class Championship {
	public long[] calc(int k){
		int m = k;
		int n = k;
		long[] arr = new long[2];
		long son = 1;
		long mum = 1;
		long temp = 1;
		//计算分母
		while(k-2 >= 0){
			temp = Combination(k*2,2);			
			k--;
			mum = temp*mum;			
		}
		System.out.println(mum);
		mum = mum/Arrangement(m);
		//计算分子
		while(m-1 > 0){
			temp = Combination(m-1,1)*Combination(m+1,1);
			m--;
			son = son*temp;
		}
		System.out.println(son);
		son = son/Arrangement(n-1);
		System.out.println(son);
		arr[0] = son;
		arr[1] = mum;
		return arr;
	}
	public static int[] Diviser(long[] arr){
		int[] res = new int[2];
		long a = arr[0];
		long b = arr[1];
		long temp = b%a;
		while(temp != 0){
			b = a;
			a = temp;
			temp = b%a;
		}		
		res[0] = (int) (arr[0]/a);
		res[1] = (int) (arr[1]/a);
		return res;
	}
	public static long Combination(int m, int n){
		long res = m;		
		res = Arrangement(m)/(Arrangement(m-n)*Arrangement(n));
		return res;
	}
	public static int Arrangement(int k){
		int res = 1;
		while(k > 0){
			res = res*k;
			k--;
		}
		return res;
	}
	public static void main(String[] args){
		Championship cp = new Championship();
		int[] res = new int[2];
		long[] arr = new long[2];
		arr = cp.calc(7);
		res = Diviser(arr);
		System.out.println(res[0]+" "+res[1]);
	}
}
