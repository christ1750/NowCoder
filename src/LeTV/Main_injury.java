package LeTV;

import java.util.Scanner;

/** 
 * author: christ 
 * data��2016��6��16�� ����11:08:52 
 * �հ��ھ���֮�Ż���³��˹�󣬴�³��˹���ϵ�����һ���߼������飬�հش򿪺�ϲ�ط�������һ������ʧ�����Ϲż���---�������ס�
 * �ü���ÿ�η���ֻ��ۺ��ٵľ���ֵ���������Ҳ�ǳ��ߡ�
 * ����ħ���������£�
 * �ѵ�ͼ����Ϊһ����ά���꣬���ܷ�����λ��(0,0)λ�á��Լ��ܷ�����Ϊ���ģ���һ���뾶Ϊr��Բ������r^2=S���������λ�����Բ�ϣ���λ��Ϊ�������꣬������˽��յ��ü��ܵ�����˺����� 
 */
public class Main_injury {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int S = in.nextInt();
			double r = Math.sqrt(S);
			int num = 0;
			int j = 1;
			for(int i = (int) r; i >= 0; i--){				
				if(Math.pow(i,2)+Math.pow(r-i,2) == S){
					num++;
				}			
			}
			System.out.println(4*num);
		}
		in.close();
		
	}

}
