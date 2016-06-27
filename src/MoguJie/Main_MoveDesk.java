package MoguJie;
/** 
 * author: christ 
 * data：2016年3月10日 下午7:31:17 
 * 类说明 
 */
import java.util.*;
public class Main_MoveDesk{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long r = in.nextInt();
            long[] a = new long[4];
            for(int i = 0; i < 4; i++){
                a[i] = in.nextInt();
            }
            long dist = 0;
            dist = (long)Math.abs(Math.pow(Math.abs(a[0]-a[2]),2)-Math.pow(Math.abs(a[1]-a[3]),2));
            
            long dist_1 = 0;
            dist_1 = (long)Math.sqrt(dist);
            long res = 0;
            res = dist_1/(2*r);
            System.out.println(res);
            
        }
        in.close();
    }
}
