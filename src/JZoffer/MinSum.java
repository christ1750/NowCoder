package JZoffer;
/** 
 * author: christ 
 * data��2016��2��26�� ����9:46:28 
 * ��˵�� 
 */
public class MinSum {
	public int FindSum(int[] Array){
		if(Array.length == 0){
			return 0;
		}else{
			int sum = Array[0];
			int temp = Array[0];
			for(int i = 1; i< Array.length; i++){
				temp = (temp < 0) ? Array[i]:Array[i]+temp;
				sum = (sum > temp) ? sum : temp;
			}
			return sum;
		}
	}

}
