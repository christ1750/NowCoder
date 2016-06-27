package Qunar;

/** 
 * author: christ 
 * data：2016年6月24日 上午9:24:49 
 * 类说明 
 */
public class ChkBloodType {
	public String[] chkBlood(String father, String mother){
		String[] res = null;
		switch (father){
		case "A":
			if(mother=="B"||mother=="AB"){
				res = new String[3];
				res[0] = "A";
				res[1] = "B";
				res[2] = "AB";								
			}else{
				res = new String[2];
				res[0] = "A";
				res[1] = "O";					
			}							
			break;
		case "B":
			if(mother == "B" || mother == "O"){
				res = new String[2];
				res[0] = "B";
				res[1] = "O";				
			}else{
				res = new String[3];
				res[0] = "A";
				res[1] = "B";
				res[2] = "AB";				
			}
			break;
		case "O":
			if(mother == "A"){
				res = new String[2];
				res[0] = "A";
				res[1] = "O";				
			}else if(mother == "B"){
				res = new String[2];
				res[0] = "B";
				res[1] = "O";				
			}else if(mother == "O"){
				res = new String[1];
				res[0] = "O";				
			}else{
				res = new String[3];
				res[0] = "A";
				res[1] = "B";
				res[2] = "AB";				
			}
			break;
		case "AB":
			if(mother == "A" || mother == "B" || mother == "AB"){
				res = new String[3];
				res[0] = "A";
				res[1] ="B";
				res[2] = "AB";				
			}else{
				res = new String[2];
				res[0] = "A";
				res[1] = "B";				
			}
			break;
		}
		return res;
	}
	public static void main(String[] args){
		ChkBloodType cbt = new ChkBloodType();
		String[] res = cbt.chkBlood("A", "B");
		for(int i = 0; i < res.length; i++){
			System.out.println(res[i]);
		}		
	}
}
