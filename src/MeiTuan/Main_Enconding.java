package MeiTuan;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Comparator;
/** 
 * author: christ 
 * data：2016年6月23日 上午8:59:15 
 * 类说明 
 */
public class Main_Enconding {	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String[] ss = in.nextLine().split("\\s");
			Map<String,Integer> map = new HashMap<>();
			for(int i = 1; i < ss.length; i++){
				Integer value = map.get(ss);
				value = value == null?1:value+1;
				map.put(ss[i], value);
			}
			Set<Map.Entry<String,Integer>> set = map.entrySet();			
			PriorityQueue<Nodes> nodeQueue = new PriorityQueue<Nodes>();
			for(Map.Entry<String, Integer> object : set){
				Nodes node = new Nodes();
				node.priority = object.getValue();
				node.context = object.getKey();
				nodeQueue.add(node);
			}
			Nodes root = null;
			while(nodeQueue.size() != 1){
				Nodes node1 = nodeQueue.poll();
				Nodes node2 = nodeQueue.poll();
				
				root = new Nodes();
				root.right = node1;
				root.left = node2;
				root.priority = node1.priority+node2.priority;
				nodeQueue.add(root);
			}
			getMap(root,0,map);
			int count = 0;
			for(int i = 1; i < ss.length; i++){
				count +=map.get(ss[i]);
			}
			System.out.println(count);
		}
	}	
	public static void getMap(Nodes root, int deep, Map<String, Integer> map){
		if(root.left == null && root.right == null){
			map.put(root.context, deep);
			return;
		}
		getMap(root.left,deep+1, map);
		getMap(root.right, deep+1, map);
	}
	class Nodes implements Comparable<Nodes>{
		int value;
		String context;
		int priority;
		Nodes left;
		Nodes right;
		public int compareTo(Nodes o2){
			return this.priority-o2.priority;
		}
	}		
}
	
