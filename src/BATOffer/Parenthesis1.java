package BATOffer;
/** 
 * author: christ 
 * data��2016��7��27�� ����3:01:12 
 * ������n���������ţ�������Ϸ��������ж��ٸ����Ϸ���ָÿһ�����Ŷ������ҵ���֮��Ե����ţ�����n=1ʱ��()�ǺϷ��ģ�����)(Ϊ���Ϸ���
 *����һ������n���뷵������ĺϷ�����������֤�����int��Χ�ڡ�
 *��˵�еĿ�������
 *
 *2n�����Ŷ���Ʊ��n������5��Ǯ��n������10��Ǯ��Ʊ����5��Ǯ1�ţ�
 *ÿ������һ��Ʊ����ƱԱ����û����Ǯ�����ж������Ŷӷ�������ƱԱ����˳����Ʊ��
 *
 *n��������ջ��˳���ж����֣�����ջ���������޴�
 *
 *
 *��n���޲��Ľڵ㹹�ɵĶ������ж����ֲ�ͬ�Ľṹ
 *
 *C(2n,n)/(2*n+1) (��ʽ)
 *h(n)=h(n-1)*(4*n-2)/(n+1);  (���ƹ�ϵ)
 */
public class Parenthesis1 {
	public int countLegalWays(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		else{
			return countLegalWays(n-1)*(4*n-2)/(n+1);
		}
	}
	public int countLegalWays1(int n){
		int a = 1;
		int b = 1;
		//��������ķ�ʽ��������������������ͬʱ����i��
		for(int i = 1; i <= n; i++){
			a *=(n+i);
			b *=i;
		}
		return a/(b*(n+1));
		
	}
	public static void main(String[] args){
		Parenthesis1 pt = new Parenthesis1();
		int a = pt.countLegalWays1(4);
		System.out.println(a);
	}
}
