package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StackMap {

   static int max=0;
   
  static  Stack<StackNode> s=new Stack<>();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
        
            int n = 10;
            
            
                
                    add(97);
                 
                    delete();
                    
                    add(20);
                    delete();
                    add(26);
                    add(20);
                    delete();
                
                    System.out.println(findMax());
                    add(91);
                    System.out.println(findMax());
                            
            
    }
    
    

    public static void add(int x){
       if(max<x){
           max=x;
       }
       StackNode sn=new StackNode(x,max);
       s.push(sn);
        
    }

     public static void delete(){
        
        s.pop();
        if(s.isEmpty())
        	max=0;
        else
        	max=s.peek().value;
       
        
    }

     public static Integer findMax(){
    	 
    	return s.peek().value;
    }
}
class StackNode{
	int key;
	int value;
	public StackNode(int key,int value){
		this.key=key;
		this.value=value;
	}
}

