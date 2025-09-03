import java.util.*;
public class BST_build {
    static class node{
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data=data;
            this.right=right;
            this.left=null;
        }
    }
    public static node insert(node root,int data)
    {
        if(root==null)
        {
            root=new node(data);
            return root;
        }
        if(root.data>data)
        {
            root.left=insert(root.left,data);
        }
        else {
            root.right=insert(root.right,data);
        }
        return root;
    }
    public static void inorder(node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data>key)
        {
            return search(root.left,key);
        } else if (root.data<key)
        {
            return search(root.right,key);
        }
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int values[]={5,1,3,4,2,7};
        node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
        }
        System.out.println(root.data);
        inorder(root);
        System.out.println();
        System.out.println("Enter a key value: ");
        int key= sc.nextInt();
        System.out.println(search(root,key));

    }
}
