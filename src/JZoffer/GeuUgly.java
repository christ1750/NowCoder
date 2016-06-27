package JZoffer;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年3月4日 上午9:17:45 
 * 类说明 
 */
public class GeuUgly {
	int count = 0;
    public int GetUglyNumber_Solution(int index) {
        
        int res = 0;
        if(index < 1){
            return 0;
        }
        if(index == 1){
            return 1;
        }
        for(int i = 0; i < 100000; i++){
            if(isUgly(i)){
                count++;
                
                if(index == count){
                    res = i;
                    break;
                }
            }
        }
        return res;
        
    }
    public boolean isUgly(int i){
        while(i/2 == 0){
            i = i/2;
        }
        while(i/3 == 0){
            i = i/3;
        }
        while(i/5 == 0){
            i = i/5;
        }
        if(i == 1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
    	//Scanner sc = new Scanner(System.in);
    	//int st = sc.nextInt();
    	GeuUgly gu = new GeuUgly();
    	int res = gu.GetUglyNumber_Solution(3);
    	System.out.println(res);
    	
    	
    }
}
