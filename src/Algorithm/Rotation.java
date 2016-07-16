package Algorithm;

/** 
 * author: christ 
 * data��2016��3��10�� ����9:24:42 
 * �ж�һ���ַ���a�ǲ����ַ���b����ת�Ӵ���eg��abc�ǲ���bca����ת�Ӵ�
 * ����˼���ǽ�b���������������bcabca����ʱ�����a���´����Ӵ�����ô����
 * ������ת�����ж�a���Ƿ���b���Ӵ�ʱ���õ���KMP�㷨
 */
public class Rotation {
	public boolean chkRotation(String a,int lena,String b,int lenb){
		if(a == null || b == null){
			return false;
		}
		String b2 = b+b;
		return getIndexOf(b2,a) != -1;
	}
	//KMP�㷨
	public int getIndexOf(String s,String m){
		if(s.length() < m.length()){
			return -1;
		}
		char[] ss = s.toCharArray();//�ı���
		char[] ms = m.toCharArray();//ģʽ��
		int si = 0;
		int mi = 0;
		int[] next = getNextArray(ms);//ģʽ����next����
		while(si < ss.length && mi < ms.length){
			if(ss[si] == ms[mi]){
				si++;
				mi++;
			}else if(next[mi] == -1){
				si++;
			}else{
				mi = next[mi];
			}
			
		}
		return mi == ms.length?si - mi : -1;
	}
	public int[] getNextArray(char[] ms){//����next����,ֻ��ģʽ���й�ϵ
		if(ms.length == 1){
			return new int[]{-1};
		}
		int[] next = new int[ms.length];
		next[0] = -1;
		next[1] = 0;
		int pos = 2;
		int cn = 0;
		while(pos < next.length){
			if(ms[pos - 1] == ms[cn]){
				next[pos++] = cn++;
			}else if(cn > 0){
				cn = next[cn];
			}else{
				next[pos++] = 0;
			}
		}
		return next;
	}										
}
