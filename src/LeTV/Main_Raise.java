package LeTV;

import java.util.Scanner;

/** 
 * author: christ 
 * data��2016��6��16�� ����10:21:56 
 * ���������ħ���������У��հض��Լ��ı��ֶ������⡣
 * Ϊ�˾�������ս�����հ����������������в��ҵ��˻���ʦ�����������ø���Ϊ�Լ����߽׻������ǡ�
 * ���������ĵȴ��Ժ󣬻���˳�����������ǣ��հغ����⣬���������һЩС�ѡ�
 * �հظ�С������ԭ��ģ�
 * 1.���ո�������Ǯ������5�ı�����
 * 2.С�ѱ���ռ����֧�����õ�5%~10%֮�䣨�����߽磩��
 * �����ܹ��ķ�Aħ�����հ����ϴ���Bħ�����հ���֪�����ж�����֧�������ɹ�ѡ��
 * ע��ħ����һ�ֻ��ҵ�λ������֧������=����֧����+С��
 *
 */
public class Main_Raise {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int A = in.nextInt();
			int B = in.nextInt();			
			int count = 0;
			int lower = (int) Math.floor(A+A*0.05) ;
			int upper = Math.min((int) (A+A*0.1), B);
			for(int i = lower; i < upper; i++){
				if(i%5 == 0){
					lower = i;
					break;
				}
			}			
			count = (upper-lower)/5+1;
			System.out.println(count);
			
		}
		in.close();
	}

}
