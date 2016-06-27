package OneOffer;
/** 
 * author: christ 
 * data：2016年4月19日 下午8:45:03 
 * 类说明 
 */
public class LongestPath {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
    int longest=0;
    public int findPath(TreeNode root) {
        // write code here
        int[] length=new int[2];
        if(root!=null){
            length=findLPath(root,1);
            if(length[0]+length[1]-1>longest){
                longest=length[0]+length[1]-1;
            }
            findPath(root.left);
            findPath(root.right);
        }
        return longest;
    }
    public int[] findLPath(TreeNode root,int order){
        int[] length1=new int[2];
        length1[0]=1;
        length1[1]=1;
        int[] length2=new int[2];
        length2[0]=1;
        length2[1]=1;
        int[] length=new int[2];
        if(root!=null){
            if((root.left==null||root.left.val!=root.val)&&(root.right==null||root.right.val!=root.val)){
                length[0]=order;
                length[1]=1;
                return length;
            }
            else{
                if(root.left!=null&&root.left.val==root.val){
                    length1=findLPath(root.left,order+1);
                }
                if(root.right!=null&&root.right.val==root.val){
                    length2=findLPath(root.right,order+1);
                }
            }
        }
        length[0]=length1[0]>length1[1]?length1[0]:length1[1];
        length[1]=length2[0]>length2[1]?length2[0]:length2[1];
        return length;
    }
    public static void main(String[] args){
    	LongestPath lp = new LongestPath();
    	//int res = lp.findPath(root);
    	System.out.println();
    }
}
