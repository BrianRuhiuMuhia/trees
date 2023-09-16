import java.util.Arrays;
import java.util.ArrayList;
class Main{
    public static void main(String[] args)
    {
BinarySearchTree bst=new BinarySearchTree();
bst.insertNode(10);
bst.insertNode(20);
bst.insertNode(30);
bst.insertNode(40);
bst.bfs(bst.root);
    }

}
class BinarySearchTree{
    Node root=null;
    private class Node{
int data=0;
Node left=null;
Node right=null;
public Node(int data){
    this.data=data;
}
public String toString()
{
    return String.valueOf(this.data);
}
    }
public void insertNode(int value)
{
this.root=insert(value,this.root);
}
public Node insert(int value,Node node)
{
if(node==null)
{
    node = new Node(value);
    return node;
}
if(node.data<value)
{
    node.left=insert(value,node.left);
}
else if(node.data>value)
{
    node.right=insert(value,node.right);
}
return node;
}
public void preOrder(Node node)
{
    if(node==null)
    return;
 System.out.println(node.data);
 preOrder(node.left); 
 preOrder(node.right);  
}
public void inOrder(Node node)
{
    if(node==null)
    return;
    preOrder(node.left); 
    System.out.println(node.data);
 preOrder(node.right);  
}
public void postOrder(Node node)
{
    if(node==null)
    return;
    preOrder(node.left); 
    preOrder(node.right);  
    System.out.println(node.data);
}
public void bfs(Node node)
{
ArrayList<Node>queue=new ArrayList<>();
queue.add(node);
while(queue.isEmpty()!=true)
{
    Node curr=queue.get(0);
    System.out.println(curr);
    queue.remove(0);
    if(curr.left!=null)
    queue.add(curr.left);
    if(curr.right!=null)
    queue.add(curr.right);
}
}
}