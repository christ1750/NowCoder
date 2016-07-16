package Algorithm;

/** 
 * author: christ 
 * data：2016年3月10日 下午9:24:42 
 * 判断一个字符串a是不是字符串b的旋转子串，eg：abc是不是bca的旋转子串
 * 具体思想是将b串连接起来，变成bcabca，此时，如果a是新串的子串，那么就是
 * 他的旋转串，判断a串是否是b的子串时利用的是KMP算法
 */
public class Rotation {
	public boolean chkRotation(String a,int lena,String b,int lenb){
		if(a == null || b == null){
			return false;
		}
		String b2 = b+b;
		return getIndexOf(b2,a) != -1;
	}
	//KMP算法
	public int getIndexOf(String s,String m){
		if(s.length() < m.length()){
			return -1;
		}
		char[] ss = s.toCharArray();//文本串
		char[] ms = m.toCharArray();//模式串
		int si = 0;
		int mi = 0;
		int[] next = getNextArray(ms);//模式串的next数组
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
	public int[] getNextArray(char[] ms){//计算next数组,只和模式串有关系
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
