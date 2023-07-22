package Traversal;
import java.util.*;
public class BinarySearchTree {

    public TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;


        public TreeNode(int data){
            this.data=data;
        }

    }

    public void insert(int value){
        root=insert(root,value);
    }

    public TreeNode insert(TreeNode root,int value){
        if(root==null){
               root = new TreeNode(value);
               return root;
        }
        if(value<root.data){
            root.left=insert(root.left,value);
        }
        else{
            root.right=insert(root.right,value);
        }
        return root;
    }

    public void inOrder(){
        inOrder(root);
    }
   public void inOrder(TreeNode root){
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+",");
        inOrder(root.right);
    }
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(TreeNode root){
        if(root == null) {
            return;
        }
        System.out.print(root.data+",");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(TreeNode root){
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+",");
    }


    public static void main(String args[]){

        BinarySearchTree bst= new BinarySearchTree();
//        Scanner ob=new Scanner(System.in);
//        System.out.println("Enter the number of elements");
//        int n=ob.nextInt();
//        System.out.println("Enter the elements");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=ob.nextInt();
//            bst.insert(a[i]);
//        }
        bst.insert(15);
        bst.insert(24);
        bst.insert(39);
        bst.insert(25);
        bst.insert(64);
        bst.insert(56);
        bst.insert(10);
        bst.insert(9);
        bst.insert(12);
        System.out.println("In Order =>");
        bst.inOrder();
        System.out.println();
        System.out.println("Pre Order =>");
        bst.preOrder();
        System.out.println();
        System.out.println("Post Order =>");
        bst.postOrder();
    }
}
