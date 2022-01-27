package hackerRank;


import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class InorderTraversal  {

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void inOrder(Node root) {
    	if(root!=null) {
    		inOrder(root.left);
    		System.out.println(root.data);
    		inOrder(root.right);
    	}
    }
    
    //height of tree
     
    public static int heightOfTree(Node root) {
    	if(root==null) {
    		return -1;
    	}
    	int lheight=heightOfTree(root.left)+1;
    	int rheight=heightOfTree(root.right)+1;
    	if(lheight>rheight) {
    		return lheight;
    	}
    	return rheight;
    	
    }
    
    //Level Order traversal
    
    public  void printLevelOrderTraversal(Node root) {
    	Queue<Node> que=new LinkedList<>();
    	if(root!=null)
    	que.add(root);
    	
    	while(!que.isEmpty()) {
    	Node n= que.poll();
    	System.out.print(n.data+" ");
    	if(n.left!=null)
        	que.add(n.left);
        	if(n.right!=null)
        	que.add(n.right);
    
    	}
    }
    
 //check if it is a binary search tree or not
    
    List<Integer> list=new ArrayList<>();
    int i=0;
        boolean checkBST(Node root) {
            if(root!=null){
                checkBST(root.left);
                list.add(root.data);
                checkBST(root.right);
            }
           for(int i=0;i<list.size()-1;i++){
               if(list.get(i+1)<=list.get(i)){
                   return false;
               }
           }
            return true;
        }
        
        
        //top view
        static  int distance=0;
        
       static  Map<Integer,List<Integer>> map=new TreeMap<>();
       static int n=0;
   	public static void topView(Node root) {
          if(root==null)
          return;
          else{
               FindTop(root,0,0);
           }
           for(Map.Entry<Integer, List<Integer>> e : map.entrySet()){
                System.out.print(e.getValue().get(0)+" ");
            }
           
       }

       public static void FindTop(Node root,int dist,int depth)
       {
           if(root==null)
           {
               return;
           }

           if(!map.containsKey(dist)){
               map.put(dist,new ArrayList<>(Arrays.asList(root.data,depth)));
           }
           else {
        	   Integer value=map.get(dist).get(1);
        	   if(depth<value) {
        		   map.remove(dist);
        		   map.put(dist,new ArrayList<>(Arrays.asList(root.data,depth)));
        	   }
           }
           
           FindTop(root.left, dist-1,depth+1);
           FindTop(root.right, dist+1,depth+1);
       }
       
        /*
       public static Node lca(Node root, int v1, int v2) {
         	// Write your code here.
             Map<Integer,Node> list1=new LinkedHashMap<>();
             Map<Integer,Node> list2=new LinkedHashMap<>();
             list1=findElement(root,v1);
             list2=findElement(root,v2);
             if(list1.containsKey(v2)){
                 return list1.get(v2);
             }
             if(list2.containsKey(v1)){
                 return list2.get(v1);
             }
            list1.keySet().retainAll(list2.keySet());
            TreeMap<Integer,Node> result=new TreeMap<>(list1);
            return result.firstEntry().getValue();
            

       }

       public static Map<Integer,Node> findElement(Node root,int element){
          Map<Integer,Node> list3=new LinkedHashMap<>();
            while(root!=null){
                 list3.put(root.data,root);
                 if(root.data==element){
                     break;
                 }
                 if(root.data>element){
                     root=root.left;
                 }
                 else
                 root=root.right;

             }
             return list3;
       }
       
       */
       
       //lowest common ancestor
       
       public static Node lca(Node root, int v1, int v2) {
           // Write your code here.
          
           if(root.data>v1&&root.data>v2){
               return lca(root.left,v1,v2);
           }
           else if(root.data<v1&&root.data<v2){
               return lca(root.right,v1,v2);
           }
           return root;
     }
     
       
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        
        Node root = null;
         {
            
            root = insert(root, 1);
            root=insert(root, 2);
            root = insert(root, 5);
            root=insert(root, 3);root = insert(root, 6);
            root=insert(root, 4);
        }
        
        inOrder(root);
       int val= heightOfTree(root);
       System.out.println(val);
       new InorderTraversal().printLevelOrderTraversal(root);
    }	
}