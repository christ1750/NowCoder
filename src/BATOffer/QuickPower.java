package BATOffer;

import java.math.BigInteger;

/** 
 * author: christ 
 * data��2016��5��13�� ����10:55:48 
 * ��˵�� 
 */
public class QuickPower {
	public int getPower(int k,int N){
		BigInteger res = BigInteger.valueOf(1);
		BigInteger tmp = BigInteger.valueOf(k);
		for(; N != 0; N >>=1){
			if((N&1) != 0){
				res = res.multiply(tmp);
			}
			tmp = tmp.multiply(tmp);
			res = res.mod(BigInteger.valueOf(1000000007));
			tmp = tmp.mod(BigInteger.valueOf(1000000007));
		}
		return res.mod(BigInteger.valueOf(1000000007)).intValue();
	}
	public static void main(String[] args){
		QuickPower qp = new QuickPower();
		int res = qp.getPower(2, 10);
		System.out.println(res);
	}
}
