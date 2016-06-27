package JingDong;
/** 
 * author: christ 
 * data：2016年6月19日 下午5:11:10 
 * 类说明 
 */
public class Apples {
	public int getInitial(int n){
		int left = 1;
		for(int j = 0; ; j++){
			boolean find = true;
			left = n*j+1;
			for(int i = 1; i < n; i++){
				if((n*(left+1)-1)/(n-1) == 0){
					left = (n*(left+1)-1)/(n-1);
				}else{
					find = false;
					break;
				}
			}
			if(find){
				break;
			}
		}
		return left;
	}

}
