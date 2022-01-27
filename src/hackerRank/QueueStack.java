package hackerRank;


	
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class QueueStack {
	    public static class MyQueue<T> {

	        Stack<T> stackNewestOnTop = new Stack<T>();
	        Stack<T> stackOldestOnTop = new Stack<T>();

	        public void enqueue(T value) { // Push onto newest stack
	            
	            stackOldestOnTop.push(value);
	        }

	        public T peek() {
	            if(stackNewestOnTop.empty()){
	               while(!stackOldestOnTop.empty()){
	                stackNewestOnTop.push(stackOldestOnTop.pop());
	            }
	            }
	               
	            return stackNewestOnTop.peek();
	        }

	        public T dequeue() {
	            if(stackNewestOnTop.empty()){
	               while(!stackOldestOnTop.empty()){
	                stackNewestOnTop.push(stackOldestOnTop.pop());
	            }
	            }
	            return stackNewestOnTop.pop();
	            
	        }
	    }

	    
	    public static void main(String[] args) {
	    	   MyQueue<Integer> queue = new MyQueue<Integer>();
	                queue.enqueue(12);
	                queue.enqueue(14);
	                System.out.println(queue.peek());
	                queue.dequeue();
	           
	                System.out.println(queue.peek());
	                queue.enqueue(71);
	                queue.enqueue(63);
	                System.out.println(queue.peek());
	            }
	    
	    }
	



