package MoguJie;

import java.util.Scanner;

/** 
 * author: christ 
 * data��2016��6��16�� ����4:00:24 
 * Arthur����ᵽ���µı����������ر��ԭ�ȵ������ԵñȽ�С��
 * ������������һ���µ����ӡ�������һ���ر������ӣ��������ɺܶ������Ƚ���֧�ŵģ�
 * ���ǻص���֮�����������Ӳ��ȣ�ԭ���������ȳ��Ȳ�̫��ͬ��
 * ����Ҫ�Լ�����������ã������������Ƴ���һЩ�����������ӱ��ƽ�ȡ�
 * �������ܹ���n���ȣ���i���ȳ���Ϊli��Arthur�Ƴ���i����Ҫ���Ѵ���Ϊdi��
 * ����k��������ƽ�ȵ�����:����һ�������ܹ��ﵽ���ȳ��ȵ����ֵ��
 * ���磺һ���ȵ�������ƽ�ȵģ������ȵ�������һ����ʱ��ƽ�ȵġ�
 * �����Arthur����һ�������ӱ�ƽ�ȵ���С�ܴ��ۡ� 
 * 
 * 
 *  6
 *  2 2 1 1 3 3
 *
 *  4 3 5 5 2 1
 *  
 * 
 *8
 */
public class Main_DeskLeg {
	public class desk{
		int len = 0;
		int cost = 0;
		public desk(int len, int cost){
			this.len = len;
			this.cost = cost;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();			
			int[] l = new int[n];
			int[] d = new int[n];
			for(int i = 0; i < n; i++){
				l[i] = in.nextInt();
			}
			for(int i = 0; i < n; i++){
				d[i] = in.nextInt();
			}			
		}
		in.close();
	}

}
