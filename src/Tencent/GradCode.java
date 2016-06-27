package Tencent;
/** 
 * author: christ 
 * data：2016年6月16日 下午8:32:40 
 * 类说明 
 */
public class GradCode {
	public String[] getGray(int n){
		if(n == 1){
			String[] res = new String[2];
			res[0] = "0";
			res[1] = "1";
			return res;
		}else{
			String[] temp = getGray(n-1);
			String[] res = new String[temp.length*2];
			for(int i = 0; i < temp.length; i++){
				res[i] = "0"+temp[i];
			}
			for(int i = 0; i < temp.length; i++){
				res[i+temp.length] = "1"+temp[temp.length-i-1];
			}
			return res;
			
		}
	}

}
