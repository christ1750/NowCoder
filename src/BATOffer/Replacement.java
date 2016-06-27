package BATOffer;
/** 
 * author: christ 
 * data：2016年5月2日 下午4:15:40 
 * 类说明 
 */
public class Replacement {
	public String replacement(String iniString,int length){		
		char[] old = iniString.toCharArray();	
		int num = 0;
		for(int i = 0; i < old.length; i++){
			if(old[i] == ' '){
				num++;
			}
		}				
		int lon = num*2+length;	
		int new_i = 0;
		char[] char_new = new char[lon];		
		for(int i = 0; i < length; i++){			
			if(old[i] != ' '){
				char_new[new_i] = old[i];				
				new_i++;
			}else{
				char_new[new_i] = '%';
				char_new[new_i+1] = '2';
				char_new[new_i+2] = '0';
				new_i = new_i + 3;
			}
			
		}
		String res = String.valueOf(char_new);
		return res;
	}
	public static void main(String[] args){
		Replacement rp = new Replacement();
		String aa = "sArcCNxjNaviToUsSN QiTtx j bgUhhIoiSfszja QfFkxk JwYOoFSg dhdMKgTxjRrcATfkb ELqIebLGZk kAESkrNJxbmci nyojZqX vawG kxvqf moWAA m aMuilydRRNvVuh Uss mJtnZb zA oF cx hUQD V dSLSLcbjXLydl V dReEozdi ZO IxbW CgcTeobRrmco ELs cQh K xlg Pj cGaO yXKXy hs kmJaSdNV Z InShcp AxoM hHLTsIMhcHKnArxgRVjh MclqtzFpl yzaWlhLfYlfxNFgb";
		String ss = rp.replacement(aa, aa.length());
		System.out.println(ss);
	}
}
