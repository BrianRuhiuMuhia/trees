import java.util.Arrays;
import java.util.ArrayList;
class Main{
    public static void main(String[] args)
    {
BinarySearchTree<Integer> bst=new BinarySearchTree<Integer>();
bst.insertNode(10);
bst.insertNode(20);
bst.insertNode(30);
bst.insertNode(40);
bst.bfs(bst.root);
    }

}
class BinarySearchTree<T>{
    Node<T> root=null;
    private class Node<T>{
T data=0;
Node<T> left=null;
Node<T> right=null;
private Node(T data){
    this.data=data;
}
public String toString()
{
    return (String) this.data;
}
        public Boolean equals(Node obj)
        {
return this.data==obj.data & node.left==obj.left & node.right==obj.right;
    }
public void insertNode(T value)
{
this.root=insert(value,this.root);
}
private Node insert(T value,Node node)
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
public void levelOrder(Node node)
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
 public int height(Node node)
{
    if(node==null)
    return -1;
    else return Math.max(height(node.left),height(node.right)) +1;
}
public Boolean search(T value,Node node)
{
if(node==null)
return false;
Node searchNode=new Node<T>(value);
if(node.equals(value))
return true;
else return search(value, node.left) | search(value,node.right);
}
public Boolean isBalanced(Node node)
{
if(node==null)
{
    return false;
}
else return height(node.left)>height(node.right) & isBalanced(node.left) & isBalanced(node.right);
}   
}
}
