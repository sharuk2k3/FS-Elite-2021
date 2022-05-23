/*

Bheemla is working with Binary Trees.
The elements of the tree is given in the level order format.
Bheemla likes to print the nodes of the tree line by line.

You will be given the root of the binary tree.
Your task is to help Bheemla to print the nodes according to his wish. 
Look at the hint for understanding.

Your task is to implement the class Solution:
	- public List<List<Integer>> printTheLines(BinaryTreeNode root):
	return the list of node values.
	
NOTE: 
Please do consider the node with data '-1' as null node in the given trees.

Input Format:
-------------
Space separated integers, elements of the tree.

Output Format:
--------------
Print the list of list of integers


Sample Input-1:
---------------
1 2 3 4 5 6 7

Sample Output-1:
----------------
[[4],[2],[1,5,6],[3],[7]]



Sample Input-2:
---------------
3 2 -1 1 -1 -1 -1 4 5

Sample Output-2:
----------------
[[4],[1],[2,5],[3]]




*/



import java.util.*;

/*
    //Structure of BinaryTreeNode for your reference.

    class BinaryTreeNode{
    	public int data; 
    	public BinaryTreeNode left, right; 
    	public BinaryTreeNode(int data){
    		this.data = data; 
    		left = null; 
    		right = null; 
    	}
    }
*/
/*
class Solution {
    public List<List<Integer>> printTheLines(BinaryTreeNode root) {
        // implement your code here.
    }
}
*/
class Node{
    BinaryTreeNode node;
    int col;
    Node(BinaryTreeNode n,int c){
        node = n;
        col = c;
    }
}
class  Day_67_P_2 {
    TreeMap<Integer,List<Integer>> map = new TreeMap<>();
    public List<List<Integer>> printTheLines(BinaryTreeNode root) {
        // implement your code here.
        if(root==null || root.data==-1)
            return new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(root,0));
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node front = queue.poll();
                if(front.node.left!=null && front.node.left.data!=-1){
                    queue.add(new Node(front.node.left,front.col-1));
                }
                if(front.node.right!=null && front.node.right.data!=-1){
                    queue.add(new Node(front.node.right,front.col+1));
                }
                List<Integer> arr;
                if(map.containsKey(front.col)){
                    arr = map.get(front.col);   
                }
                else{
                    arr = new ArrayList<Integer>();
                }
                arr.add(front.node.data);
                map.put(front.col,arr);
            }
        }
        return new ArrayList<>(map.values());
    }
}