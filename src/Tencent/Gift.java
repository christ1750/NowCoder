package Tencent;
/** 
 * author: christ 
 * data��2016��6��16�� ����8:38:18 
 * ��˵�� 
 */
public class Gift {
	public int getValue(int[] gifts, int n){
		int j = 0;
		for(int i = 0; i < n-1; i++){
			j = i+1;
			if(gifts[i] != gifts[j]){
				gifts[i] = -1;
				gifts[j] = -1;
				i++;
			}
		}
		for(int i = 0; i < n/2; i++){
			if(gifts[i] != -1){
				return gifts[i];
			}
		}
		return 0;
	}

}
