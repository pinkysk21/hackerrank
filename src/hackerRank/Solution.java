package hackerRank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static void dynamicArray(int n, List<List<Integer>> queries) {
    // Write your code here
        List<List<Integer>> seq=new ArrayList<List<Integer>>();
        int lastAnswer=0;
        for(int i=0;i<n;i++) {
        	List<Integer> l=new ArrayList<>();
        	seq.add(l);
        }
        List<Integer> value=new ArrayList<>();
        for(List<Integer> l:queries){
            int val=(l.get(1)^lastAnswer)%n;
            if(l.get(0)==1){
                seq.get(val).add(l.get(2));
            }
            else if(l.get(0)==2){
                int temp=l.get(2)%seq.get(val).size();
                lastAnswer=seq.get(val).get(temp);
                value.add(lastAnswer);
                System.out.println(lastAnswer);
            }
        }
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
       
        int n = 2;

        int q = 5;

        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> q1=new ArrayList<>();
        q1.add(1);
        q1.add(0);
        q1.add(5);
        queries.add(q1);
        queries.add(Arrays.asList(1,1,7));
    
        queries.add(Arrays.asList(1,0,3));
        queries.add(Arrays.asList(2,1,0));
        queries.add(Arrays.asList(2,1,1));
        
   
        System.out.println(queries);

      Result.dynamicArray(n, queries);

       
    }
}