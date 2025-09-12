public class Queue_LL {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static Node front=null;
    static Node rear=null;
    public static void enqueue(int data)
    {
        Node newnode=new Node(data);
        if(front==null && rear==null)
        {
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }
    public static void dequeue()
    {
        if(front==null && rear==null)
        {
            System.out.println("Queue is empty!!...");
        }
        else if (rear==front){
            System.out.println("The deleted element is: "+front.data);
            rear=front=null;
        } else
        {
            System.out.println("The deleted element is: "+front.data);
            front=front.next;
        }
    }
    public static void display()
    {
        Node idx=front;
        if(front==null && rear==null)
        {
            System.out.println("The Queue is empty!!.....");
        }
        while (idx!=rear)
        {
            System.out.print(idx.data+" --> ");
            idx=idx.next;
        }
        System.out.println(idx.data);
    }
    public static void size()
    {
        Node idx=front;
        int count=0;
        if(front==null && rear==null)
        {
            System.out.println("The Queue is empty..!!");
        }
        while(idx!=rear)
        {
            count++;
            idx=idx.next;
        }
    }
    public static void main(String[] args) {
        dequeue();
        size();
        int array[]={1,2,3,4,5};
        for(int i=0;i<array.length;i++)
        {
            enqueue(array[i]);
        }
        size();
        display();
        dequeue();
        dequeue();
        enqueue(12);
        display();
        size();
    }
}
