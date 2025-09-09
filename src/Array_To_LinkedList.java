

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
    public static void main(String[] args) {
        int arr[]={4,7,8,5,6,2};
        Node head=null;
        for(int i=0;i<arr.length;i++)
        {
            head=create(head,arr[i]);
        }
        System.out.println(head.data);
        print(head);
        deleteFirst(head);
        print(deleteFirst(head));

    }
}
