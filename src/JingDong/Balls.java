package JingDong;
/** 
 * author: christ 
 * data��2016��6��10�� ����9:47:53 
 * ��˵�� 
 */
public class Balls {
	public static void main(String[] args){
		Balls bs = new Balls();
		int res = bs.calDistance(100, 90, 80, 70);
		System.out.println(res);
		
	}
	public int calDistance(int A, int B, int C, int D){
		return 3*(A+B+C+D);
	}

}
