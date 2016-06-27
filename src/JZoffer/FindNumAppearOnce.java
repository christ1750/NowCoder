package JZoffer;
/** 
 * author: christ 
 * data：2016年3月2日 下午5:21:29 
 * 类说明 
 */
public class FindNumAppearOnce {
	public void FindNumsAppearOnce(int[] array,int num1[],int num2[]){
		if(array.length == 0){
			num1[0] = 0;
			num2[0] = 0;
			return ;
		}
		int len = array.length;
		int index = 0;
		int sum = 0;
		for(int i = 0; i < len; i++){
			sum ^= array[i];
		}
		for(index = 0; index < 32; index++){
			if((sum & (1<<index)) != 0){
				break;
			}		
		}
		for(int i = 0; i < len; i++){
			if((array[i] & (1<<index)) != 0){
				num2[0] ^= array[i];
			}else{
				num1[0] ^= array[i];
			}
		}
		
	}
	public int find1From2(int[] a){
		int len = a.length;
		int res = 0;
		for(int i = 0; i < len; i++){
			res = res ^ a[i];
		}
		return res;		
	}
	public int find1From3(int[] a){
		int[] bits = new int[32];
		int len = a.length;
		for(int i = 0; i < len; i++){
			for(int j = 0; j < 32; j++){
				bits[j] = bits[j] + ((a[i] >>> j) & 1);
			}
		}
		int res = 0;
		for(int i = 0; i < 32; i++){
			if(bits[i] % 3 != 0){
				res = res |(1<<i);
			}
		}
		return res;
	}

}
