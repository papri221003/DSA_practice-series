

import java.util.*;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree {
    static int idx=-1;
    public  Node binaryTreecreate(int nodes[])
    {
        idx++;
        if(nodes[idx]==-1)
        {
            return null;
        }
        Node newnode=new Node(nodes[idx]);
        newnode.left=binaryTreecreate(nodes);
        newnode.right=binaryTreecreate(nodes);
        return newnode;
    }

    public void preorder(Node root)
    {
        if(root==null)
        {
            System.out.print(-1+"  ");
            return;
        }
        System.out.print(root.data+"  ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root)
    {
        if(root==null)
        {
            System.out.print(-1+"  ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);
    }
    public void postorder(Node root)
    {
        if(root==null)
        {
            System.out.print(-1+"  ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"  ");
    }
    public void levelorder(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currNode=q.remove();
            if(currNode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
        }
    }

    public int countNode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftNode=countNode(root.left);
        int rightNode=countNode(root.right);
        return leftNode+rightNode+1;
    }
    public int sumNode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int sumLeft=sumNode(root.left);
        int sumRight=sumNode(root.right);
        return sumLeft+sumRight+root.data;
    }
    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int LeftSubtreeHeight=height(root.left);
        int RightSubtreeHeight=height(root.right);
        return Math.max(LeftSubtreeHeight,RightSubtreeHeight)+1;
    }
    public int diaApproach1(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int dia1=diaApproach1(root.left);
        int dia2=diaApproach1(root.right);
        int dia3=height(root.left)+height(root.right)+1;
        return Math.max(dia3,Math.max(dia1,dia2));
    }
    class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam)
        {
            this.ht=ht;
            this.diam=diam;
        }
    }
    public TreeInfo diaApproach2(Node root)
    {
        if(root==null)
        {
            return new TreeInfo(0,0);
        }
        TreeInfo left=diaApproach2(root.left);
        TreeInfo right=diaApproach2(root.right);
        int myheight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3= left.ht+right.ht+1;

        int mydiam=Math.max(diam3,Math.max(diam1,diam2));
        TreeInfo myInfo=new TreeInfo(myheight,mydiam);
        return myInfo;
    }


}
public class BuildTree {
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.binaryTreecreate(nodes);
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        System.out.println();
        tree.levelorder(root);
        System.out.println("The total no of nodes present in this tree is "+tree.countNode(root));
        System.out.println("The sum of the nodes is: "+tree.sumNode(root));
        System.out.println("The height of the tree is: "+tree.height(root));
        System.out.println("The diameter of the tree with O(n^2): "+tree.diaApproach1(root));
        System.out.println("The diameter of the tree with O(n): "+tree.diaApproach2(root).diam);
        System.out.println("The height of the tree with diameter approach O(n): "+tree.diaApproach2(root).ht);


    }
}
