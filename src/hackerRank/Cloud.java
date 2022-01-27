package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Cloud {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<c.length;i++){
            if(c[i]==1){
                continue;
            }
            map.put(i,c[i]);
        }
        Set<Integer> s=map.keySet();
      //  Iterator iter=s.iterator();
    //    while(iter.hasNext()) {
      //  	if(iter.next()==)
     //   }
        int[] values=s.stream().mapToInt(Integer::intValue).toArray();
        int count=0;
        int newArray[]=new int[values.length];
        int j=0;
        for(int i=0;i<values.length;i++) {
        	newArray[j]=values[i];
        	j++;
        	if((i+1)<values.length&&(i+2)<values.length&&(values[i+1]==(values[i]+1))&&(values[i+2]==(values[i]+2))) {
        		i++;
        	}
        }
        return j-1;
    }

  
    public static void main(String[] args) throws IOException {
        
        

        int[] c = {0,0,0,0,1,0};

       
        int result = jumpingOnClouds(c);
        System.out.println(result);
    }
}
