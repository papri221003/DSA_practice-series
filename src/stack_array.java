public class stack_array {
    static int N=10;
    static int stack[]=new int[N];
    static int top=-1;
    public static void push(int x)
    {
        if(top==N-1)
        {
            System.out.println("Stack Overflow!!.....");
            return;
        }
        else
        {
            top++;
            stack[top]=x;
        }
    }
    public static int pop()
    {
        if(top==-1)
        {
            return 0;
        }
        else
        {
            int item=stack[top];
            top--;
            return item;
        }
        //return 0;
    }
    public static void display()
    {
        int i=top;
        while(i>0)
        {
            System.out.print(stack[i]+" --> ");
            i--;
        }
        System.out.println(stack[i]);
    }
    public static int size()
    {
        if(top==-1)
        {
            return 0;
        }
        return top+1;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        for(int i=0;i<array.length;i++)
        {
            push(array[i]);
        }
        System.out.println( "The size of the element is: "+size());
        display();
        System.out.println("The popped element is: "+pop());
        System.out.println("The popped element is: "+pop());
        push(12);
        display();
        System.out.println( "The size of the element is: "+size());
    }
}
