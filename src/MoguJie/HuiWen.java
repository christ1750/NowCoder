package MoguJie;
/** 
 * author: christ 
 * data��2016��3��10�� ����7:54:01 
 * ��˵�� 
 */
public class HuiWen {
	public boolean Add1Word(String str){
		int len = str.length();
		int flag = 0;
		if(len%2 == 1){//����Ϊ����ʱ			
			for(int i = 0; i < len/2-1; i++){
				if(str.charAt(i) != str.charAt(len-i-1)){
					flag++;
				}
			}
		}else{//����Ϊż��ʱ
			for(int i = 0; i < len/2-1; i++){
				if(str.charAt(i) != str.charAt(len-i-1)){
					flag++;
				}
			}
		}
		if(flag != 0 || flag != 1){
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		HuiWen hw = new HuiWen();
		boolean b = hw.Add1Word("oooo");
		if(b){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
