package MeiTuan;
/** 
 * author: christ 
 * data：2016年6月23日 上午9:04:58 
 * 类说明 
 */
public class Printer {
	public int[] arrayPrint(int[][] arr, int n){
		int num = 0;
		int len = (1+n)*n/2+(1+n-1)*(n-1)/2;
		int[] res = new int[len];
		int j = n-1;
		int i = 0;		
		while(true){
			res[num] = arr[i][j];
			System.out.println(res[num]);			
			if(i == n-1&&j == n-1){
				i = 1;
				j = 0;
				num++;
				break;
			}			
			if(j == n-1){
				j=j-i-1;
				i = 0;
				num++;
			}else{
				num++;
				i++;
				j++;
			}						
		}					
		while(num < len){
			res[num] = arr[i][j];
			System.out.println(res[num]);
			if(i == n-1){
				i = i-j+1;
				j = 0;
				num++;
				
			}else{
				num++;
				i++;
				j++;
			}
		}
		return res;
	}
	public static void main(String[] args){
		Printer mp = new Printer();
		int k = 1;
		int[][] b = new int[4][4];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				b[i][j] = k++; 				
			}
		} 
		int[] a = mp.arrayPrint(b, 4);
	}

}
