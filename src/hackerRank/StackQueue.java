package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StackQueue {
 private static final Scanner scanner = new Scanner(System.in);
         
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Stack<Integer> sfirst=new Stack<Integer>();
        Stack<Integer> second=new Stack<Integer>();
        for (int i = 0; i < queriesCount; i++) {
           int value = scanner.nextInt();
            if(value==1){
                sfirst.push(scanner.nextInt());
            }
            else if(value==2){
                if(!second.empty()){
                 second.pop();
            
                }
                else{
                while(!sfirst.empty()){
                    second.push(sfirst.pop());
                }
               second.pop();
                 
                }
            }
            else if(value==3){
                if(!second.empty()){
                   // System.out.println(second.peek());
                   bufferedWriter.write(String.valueOf(second.peek()));
                    bufferedWriter.write("\n");
                   
                }
                else{
                    while(!sfirst.empty()){
                    second.push(sfirst.pop());
                }
                   // System.out.println(second.peek());
                 bufferedWriter.write(String.valueOf(second.peek()));
                  bufferedWriter.write("\n");
                }
                }
            }
        


        /*
       
        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }
*/
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


