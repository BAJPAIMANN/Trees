package Traversal;

import java.util.*;

public class BinarySearch {
    
    private TreeNode root;
    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        private TreeNode(int data){ this.data=data; }
    }
    
    public void insert(int value){
        root=insert(root,value);
    }
    
    public TreeNode insert(TreeNode root, int value){
        if(root==null){
            root=new TreeNode(value);
            return root;
        }
        if(value<root.data)
            root.left=insert(root.left,value);
        else 
            root.right=insert(root.right,value);
        return root;
    }
    public void binarySearch(int value){
        binarySearch(root,value);
    }

    public void binarySearch(TreeNode root,int ele){
        if (root==null) {
            System.out.println("Element not found!");
            return;
        }
        if (root.data == ele) {
            System.out.println("Element found!");
            return;
        }
        if (ele < root.data)
            binarySearch(root.left, ele);
        else
            binarySearch(root.right, ele);
    }
    
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        BinarySearch bs=new BinarySearch();
//        System.out.println("Enter the number of elements");
//        int n=ob.nextInt();
//        System.out.println("Enter the elements");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=ob.nextInt();
//            bs.insert(a[i]);
//        }
        bs.insert(15);
        bs.insert(24);
        bs.insert(39);
        bs.insert(25);
        bs.insert(64);
        bs.insert(56);
        bs.insert(10);
        bs.insert(9);
        bs.insert(12);
        System.out.println("Enter the element to be found!");
        int ele=ob.nextInt();

        bs.binarySearch(ele);
        
    }
}
