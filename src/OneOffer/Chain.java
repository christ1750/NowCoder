package OneOffer;
/** 
 * author: christ 
 * data��2016��4��19�� ����8:46:46 
 * ��˵�� 
 */
public class Chain {
    public int findK(int n) {
        // write code here
    	int res = 0;
        if(n <= 3){
            return 0;
        }
        if(n < 100){
        	res = (n+1)/2-1;
        }else{
        	res = (n+1)/2;
        }
        
        return res;
    }
    public static void main(String[] args){
    	Chain ch = new Chain();
    	int a = ch.findK(7);
    	System.out.println(a);
    }
}
