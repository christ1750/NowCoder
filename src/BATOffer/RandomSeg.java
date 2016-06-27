package BATOffer;

import java.util.Random;

/** 
 * author: christ 
 * data：2016年5月11日 上午9:14:36 
 * 类说明 
 */
//调用两次f(),如果调用两次，区间仍然在（0,x）上的话，那么概率一定是x^2
public class RandomSeg {
	private Random rand = new Random(12345);
	public double f(){
		return rand.nextFloat();
	}
	public double random(int k,double x){
		if(k < 1){
			return 0;
		}
		double res = -1;
		for(int i = 0; i < k; i++){
			res = Math.max(f(), res);
		}
		return res;
	}
	public static void main(String[] args){
		RandomSeg rs = new RandomSeg();
		double res = rs.random(1, 0.5);
		System.out.println(res);
	}
}
