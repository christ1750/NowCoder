package HuaWei;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年3月3日 上午9:40:56 
 * 类说明 
 */
public class BuyChickens {
	    public ArrayList<ArrayList<Integer>>  BuyChick(){
	        
	        ArrayList<ArrayList<Integer>> max = new ArrayList<ArrayList<Integer>>();
	        for(int i = 0; i < 20; i++){
	            for(int j = 0; j < 34; j++){
	                int k = 100 - i - j;
	                if(i * 5 + j *3 + k/3 == 100 && k%3 == 0){
	                	ArrayList<Integer> res = new ArrayList<Integer>();
	                	res.add(i);
	                	res.add(j);
	                	res.add(k);
	                	max.add(res);   
	                }
	                 
	                }
	           
	            }
	        
	        return max;
	        }
	        
	    
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        BuyChickens bc = new BuyChickens();
	        ArrayList<ArrayList<Integer>> chicks = bc.BuyChick();
	        System.out.println("鸡的个数是： " + chicks);
	    }
	}

