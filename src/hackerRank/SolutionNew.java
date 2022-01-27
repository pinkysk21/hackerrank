package hackerRank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionNew {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        Set<SinglyLinkedListNode> set=new LinkedHashSet<SinglyLinkedListNode>();
        
       while(head1!=null) {
    	   set.add(head1);
    	   head1=head1.next;
       }
        while(head2!=null){
                    if(set.contains(head2)){
                        return head2.data;
                    }
                    head2=head2.next;
            }
           

        
        return 0;

    }

    
   
        
        
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
            

            SinglyLinkedList llist1 = new SinglyLinkedList();
            llist1.insertNode(1);
            llist1.insertNode(2);
            llist1.insertNode(3);
          //  llist1.insertNode(1);
            
          	SinglyLinkedList llist2 = new SinglyLinkedList();
          	 llist2.insertNode(1);
          	 llist2.insertNode(3);
         // 	 llist2.insertNode(1);
           
          
          	SinglyLinkedListNode ptr1 = llist1.head;
            SinglyLinkedListNode ptr2 = llist2.head;

            

            int result = findMergeNode(llist1.head, llist2.head);

            System.out.println(result);
        }
     
    }

