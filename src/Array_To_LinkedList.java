

public class Array_To_LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    //static Node head=null;
    public static Node create(Node head,int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return head;
        }
        Node currnode=new Node(data);
        currnode = head;
        while(currnode.next!=null)
        {
            currnode=currnode.next;
        }
        currnode.next=newnode;
        currnode=newnode;

        return head;
    }
    public static void print(Node head)
    {
        Node currnode=head;
        while(currnode.next!=null)
        {
            System.out.print(currnode.data+" --> ");
            currnode=currnode.next;
        }
        System.out.println(currnode.data);
    }
    public static Node deleteFirst(Node head)
    {
        if(head.next==null)
        {
            head=null;
            System.out.println("The list is empty..");
            return head;
        }
        head=head.next;
        return head;
    }
    public static Node deleteWithValueX(Node head,int x)
    {
        if(head.data==x)
        {
            head=head.next;
            return head;
        }
        Node curr=head.next;
        Node prev=head;
        while(curr.data!=x)
        {
            prev=prev.next;
            curr=curr.next;
        }
        prev.next=curr.next;

        return head;

    }
    public static Node deleteKth(Node head,int y)
    {
        if(y==1) {
            head = head.next;
            return head;
        }
        Node curr=head.next;
        Node prev=head;
        int count=1;
        while(curr.next!=null)
        {
            count++;
            if(count==y)
            {
                prev.next=curr.next;
                break;
            }
            prev=prev.next;
            curr=curr.next;
        }
        return head;

    }
    public static void main(String[] args) {
        int arr[]={4,7,8,5,6,2};
        Node head=null;
        for(int i=0;i<arr.length;i++)
        {
            head=create(head,arr[i]);
        }
        System.out.println(head.data);
        print(head);
        Node head2=deleteFirst(head);
        print(head2);
        print(deleteWithValueX(head2,8));
        print(deleteKth(head2,1));
    }
}




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
class Solution {
    private int getsize(ListNode head)
    {
        ListNode curr=head;
        int count=0;
        if(head==null)
        {
            return 0;
        }
        while(curr!=null)
        {
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=getsize(head);
        int target=(size-n)+1;
        if(target==1) {
            head = head.next;
            return head;
        }
        ListNode curr=head.next;
        ListNode prev=head;
        int pos=1;
        while(curr.next!=null)
        {
            pos++;
            if(pos==target)
            {
                prev.next=curr.next;
                break;
            }
            prev=prev.next;
            curr=curr.next;
        }
        return head;

    }
}
*/
