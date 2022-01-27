package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new StringAnagram().makeAnagram("abc","abc"));
	}
	
	public static int makeAnagram(String a, String b) {
	    // Write your code here
	    List<Character> list=new ArrayList<>();
	    for(int i=0;i<a.length();i++){
	        list.add(a.charAt(i));
	        
	    }
	    List<Character> list1=new ArrayList<>();
	     for(int i=0;i<b.length();i++){
	        list1.add(b.charAt(i));
	        
	    }
	    List<Character> list2=new ArrayList<>();
	    for(Character c:list){
	        if(!list1.isEmpty()){
	            if(list1.contains(c)){
	                list2.add(c);
	              //  list.remove(c);
	                list1.remove(c);
	            }
	        }
	    }
	    return Math.abs(list1.size()+list.size()-list2.size());
	    }

}
