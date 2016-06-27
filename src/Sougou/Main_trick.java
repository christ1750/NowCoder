package Sougou;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/** 
 * author: christ 
 * data：2016年6月22日 下午9:24:59 
 * 类说明 
 */
public class Main_trick {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = Integer.parseInt(in.nextLine());
			HashMap<Integer,HashSet<Integer>> allMap = new HashMap<>();
			HashSet<Integer> res = new HashSet<>();
			for(int i = 0; i < n; i++){
				String[] str = in.nextLine().split("\\s");
				int Id = Integer.parseInt(str[0]);
				HashSet<Integer> ansId = new HashSet<>();
				for(int j = 0; j < str.length; j++){
					int aid = Integer.parseInt(str[j]);
					ansId.add(aid);
					if(Id != aid && allMap.containsKey(aid)){
						HashSet<Integer> temp = allMap.get(aid);
						if(temp.contains(Id)){
							res.add(Id);
							res.add(aid);
						}
					}
				}
				if(allMap.containsKey(Id)){
					ansId.addAll(allMap.get(Id));
				}
				allMap.put(Id, ansId);
			}
			for(Integer Key : allMap.keySet()){
				HashSet<Integer> value = allMap.get(Key);
				value.retainAll(res);
				if(value.size()>1){
					res.add(Key);
				}
			}
			System.out.println(res.size());
			for(Integer id : res){
				System.out.println(id);
			}													
		}
		in.close();
	}

}
