package hackerRank;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Qheap {

	
	static PriorityQueue<Integer> pq=new PriorityQueue<>();

	public static void add(Integer value){
	    pq.add(value);
	}

	public static void delete(Integer value){
	    pq.remove(value);
	}

	public static Integer max(){
	    return pq.peek();
	}

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        
	        for (int i = 0; i < n; i++) {
	            int operation = scan.nextInt();
	            if (operation == 1) { // enqueue
	                add(scan.nextInt());
	            } else if (operation == 2) { // dequeue
	                delete(scan.nextInt());
	            } else if (operation == 3) { // print/peek
	                System.out.println(max());
	            }
	        }
	        scan.close();
	    }
	
}
