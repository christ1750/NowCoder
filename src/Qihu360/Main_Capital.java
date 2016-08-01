package Qihu360;

import java.util.Scanner;

/** 
 * author: christ 
 * data��2016��6��18�� ����10:12:43 
 * 360Ա�������������һ�����٣�һ���˱��Ű���ȥ�������ˡ�
 * ·�ϣ���������һ��С�򣬷���С������Ƕ�Χ��һ������������
 * ����ǰѯ���������֪С���������ȱһ���򳤣�����ϣ����ѡһ��֪���ֹ������򳤣��������ϣ����ѡ��һ���ˣ�
 * �����˶���ʶ������ͬʱ������ʶ���ϳ��Լ�����������ˣ��ڴˣ�����Ĭ��ÿ�����Լ���ʶ�Լ�����
 * ����С�������̫���ˣ�һ���Ӵ��˭Ҳ˵������˭��
 * ����򵥰��������ʾ��������һ����ͳ�Ƴ��������������໥֮�����ʶ��ϵ������һ�����ҵ��˺��ʵ�����ѡ��
 * ����������Ҳ�õ�������һ����ʶ��ϵ���嵥�����������������ʶ��ϵ�ǵ���ģ�
 * ����A��ʶB��B��ʶA���໥�����ģ�ֻ����A��ʶB�Ͳ�����ΪB��ʶA��
 * ���磬����ʶ�㣬�㲻һ����ʶ�ҡ����ң��������ʶ��ϵҲ�����д����ԣ�����A��ʶB��B��ʶC�����ⲻ����A��ʶC��
 * ͬʱ��Ϊ�˷��㴦������嵥�У����ϵ�N�������α��Ϊ1��N�����ܷ����һ�������ҵ����ʵ�����ѡ�أ� 
 */
public class Main_Capital {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();									
			for(int i = 0; i < n; i++){
				int per_num = in.nextInt();
				int count = in.nextInt();										
				int[][] relation = new int[count][2];
				for(int j = 0; j < per_num; j++){
					relation[j][0] = in.nextInt();
					relation[j][1] = in.nextInt();
				}
				isWho(per_num,count,relation);
			}
		}
		in.close();
	}
	public static void isWho(int n, int m, int[][] relation){
		int[] count = new int[n+1];
		for(int i = 0; i < m; i++){
			if(relation[i][0] != relation[i][1]){
				count[relation[i][1]]++;
			}
		}
		int f = 0;
		int k = 0;
		for(int i = 1; i <= n; i++){
			if(count[i] == n-1){
				f++;
				k = i;
			}
		}
		if(f == 1){
			System.out.println(1+"\n"+k);
		}else{
			System.out.println(0+"\n");
		}
	}

}
