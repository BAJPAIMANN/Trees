package Traversal;
import java.util.*;

public class LevelOrderBFS {

    private TreeNode root;

    public class TreeNode{

        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){ this.data=data;}
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
    public void levelOrder(){
        levelOrder(root);
    }
    public void levelOrder(TreeNode root){

        if(root==null)
            return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(queue.peek()!=null){
            TreeNode temp=queue.poll();
            System.out.print(temp.data+",");
            if(temp.left!=null)
                queue.offer(temp.left);
            if(temp.right!=null)
                queue.offer(temp.right);
        }
    }
    public void BFS(int ele){
        BFS(root,ele);
    }
    public void BFS(TreeNode root,int ele){
        if(root==null)
            return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(queue.peek()!=null){
            TreeNode temp=queue.poll();
            if(temp.data==ele) {
                System.out.println("Element found = "+temp.data);
                return;
            }
            if(temp.left!=null)
                queue.offer(temp.left);
            if(temp.right!=null)
                queue.offer(temp.right);
        }
        System.out.println("Element not found!");
    }
    public static void main(String[] args){

        LevelOrderBFS level=new LevelOrderBFS();
        Scanner ob=new Scanner(System.in);
//        System.out.println("Enter the number of elements");
//        int n=ob.nextInt();
//        System.out.println("Enter the elements");
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=ob.nextInt();
//            level.insert(a[i]);
//        }
        level.insert(15);
        level.insert(24);
        level.insert(39);
        level.insert(25);
        level.insert(64);
        level.insert(56);
        level.insert(10);
        level.insert(9);
        level.insert(12);
        System.out.println("Enter the element to be found!");
        int ele=ob.nextInt();

        level.BFS(ele);
        level.levelOrder();

    }
}
