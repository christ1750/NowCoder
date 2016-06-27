package OneOffer;
/** 
 * author: christ 
 * data：2016年4月19日 下午8:43:26 
 * 类说明 
 */
import java.util.*;

public class Transform {
    public String trans(String s, int n) {
        StringBuffer sb = new StringBuffer();
        char[] arr = new char[n];
        String res = new String();
        sb = s.
        arr = s.toCharArray();
        for(int i = 0; i < n/2; i++){
            //char temp = sb.charAt(i);            
            //sb.charAt(i) = sb.charAt(n-i-1);
            sb.reverse();
            
            //arr[n-i-1] = temp;
        }
        int num = 0;
        for(int i = 0; i < n; i++){            
            if(arr[i] != ' '){
                num++;
            }
            else{
               for(int j = 0; j < num/2; j++){
            	   char temp = arr[i];            
                   arr[i] = arr[n-i-1];
                   arr[n-i-1] = temp;
                   
            	}
                num = 0;
            }
            
        }
        for(int i = 0; i < n; i++){
            res.indexOf(i) = arr[i];          		
        }
        return res;
    }
    public static void main(String[] args){
    	Transform tr = new Transform();
    	String s = tr.trans("this is a world", 16);
    	System.out.println(s);    	
    }
}
