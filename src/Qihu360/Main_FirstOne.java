package Qihu360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/** 
 * author: christ 
 * data��2016��6��18�� ����10:04:51 
 * author: christ 
 * data��2016��7��29�� ����8:39:25 
 * ������սһ��CrackMe���㣬����Ҫ��д��ǰ�漸λ���붼��ȷ�³��ˣ����������һλ���룬����ص��е��
 * CrackMe�����߻����ư����������˸�.tar.gz�ļ�����ѹ������������д��
 * ��Ҫ�����һ���ַ�������������ַ��������ַ������������ַ����е�һ��ֻ����һ�ε��ַ���
 *�����磬����abaccdeff����ô��ȷ�ַ�����b�ˣ� Ȼ��������������ַ�������̫��̫���ˣ�����������ȫ�޷��ҳ�����
 * ���ǣ�����Ҫдһ����������ˡ�
 * 
 * 2
 * abaccdeff
 * testonline
 * 
 * b
 * s
 */
public class Main_FirstOne {
	public static void main(String[] args){
		int T = 0;
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try{
			T = Integer.parseInt(b.readLine());
			for(int i = 0; i < T; i++){
				String str = b.readLine();
				System.out.println(first(str));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static char first(String s){
		int a = 0x21;
		int hash[] = new int[94];
		for(int i = 0; i < s.length(); i++){
			hash[s.charAt(i)-a]++;
		}
		for(int i = 0; i < s.length(); i++){
			if(hash[s.charAt(i)-a] == 1){
				return s.charAt(i);
			}
		}
		return '0';
	}

}
