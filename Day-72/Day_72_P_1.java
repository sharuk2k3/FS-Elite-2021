/*

A set of boxes are connected with each other and formed a line.
Each box is assigned with an ID, the box ID's may be repeated.

You are given the entire line as a singly linked list.
You can visit box-1 from box-0, and box-2 from box-1,.. and so on.
All the box IDs are arranged in ascending order of absolute values of IDs.

Your task is to arrange the boxes in the ascending order of original values of IDs.

Implement the class Solution:
   1. public Node sortBoxList(Node head) : 
   - returns the head node, after list is modified accordingly


Input Format:
-------------
Single line of space separated integers, box ID's in the form SLL.

Output Format:
--------------
Print the list after modification.


Sample Input:
-------------
1 2 -2 4 -4 5 6 7 8 -9 9

Sample Output:
--------------
-9 -4 -2 1 2 4 5 6 7 8 9



*/

import java.util.*;

/*
//for your reference

class Node {
    int data;
    Node next;
    Node() {}
    Node(int data) { this.data = data; }
    Node(int data, Node next) { 
		this.data = data; 
		this.next = next; 
	}
}

*/

class  Day_72_P_1  {
    public Node sortBoxList(Node head) {
        //Implement your code here
        Node cur= head;
        while(cur!=null && cur.next!=null){
            if(cur.next.data<0){
                Node temp=cur.next;
                cur.next=cur.next.next;
                temp.next=head;
                head=temp;
            }
            else{
                cur=cur.next;
            }
        }
        return head;
    }

}
