package hackerRank;



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MergeLinkedList {

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

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1==null){
            return head2;
        }
        else if(head2==null){
            return head1;
        }
        else{
            SinglyLinkedListNode n1=head1;
            SinglyLinkedListNode n2=head2;
            SinglyLinkedListNode prev1=head1;

            SinglyLinkedListNode prev2=head2;
            while(n1!=null&n2!=null){
                if(n1.data<n2.data){
                    prev1=n1;
                    prev2=n2;                                    
                n1=n1.next;
                }
                else{
                    SinglyLinkedListNode next=n2.next;
                    n2.next=n1;
                    if(n1==head1){
                        head1=n2;
                    }
                    else{
                    prev1.next=n2;
                    }
                    prev1=n2;
                    n2=next;
                }
                
            }
            if(n2!=null){
                prev1.next=prev2;
            }
            
            return head1;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
            SinglyLinkedList llist1 = new SinglyLinkedList();

           

                llist1.insertNode(1);
                llist1.insertNode(4);
                llist1.insertNode(5);
          
          	SinglyLinkedList llist2 = new SinglyLinkedList();

            

                llist2.insertNode(2);
                llist2.insertNode(3);
                llist2.insertNode(6);

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);
            while(llist3!=null) {
            	System.out.println(llist3.data);
            	llist3=llist3.next;

            
        }

       
    }
}
