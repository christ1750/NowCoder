package wangyi;

import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年8月3日 上午9:16:28 
 * 类说明 
 */
public class Apple {		
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    	while(sc.hasNext()){
	    		String s1=sc.nextLine();
	    		String s2[]=sc.nextLine().split(" ");
	    		int n=Integer.parseInt(s1);
	    		int sum=0;
	    		int[] apple=new int[n];
	    		for(int i=0;i<s2.length;i++){
	    			int temp=Integer.parseInt(s2[i]);
	    			apple[i]=temp;
	    			sum+=temp;
	    		}
	    		if(sum%n!=0){
	    			System.out.println(-1);
	    			continue;
	    		}
	    		int a=sum/n;
	    		int flag=0;
	    		int res=0;
	    		for(int i=0;i<apple.length;i++){
	    			if(Math.abs(a-apple[i])%2!=0){
	    				System.out.println(-1);
	    				flag=1;
	    				break;
	    			}
	    			if(apple[i]>a)res+=apple[i]-a;
	    		}
	    	if(flag==0)System.out.println(res/2);
	    	else continue;
	    }
	    	sc.close();
	}
}
