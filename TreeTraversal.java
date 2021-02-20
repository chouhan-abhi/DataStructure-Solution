import java.util.Queue;
import java.util.LinkedList;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;        
    }
}


public class TreeTraversal {
    static void preOrderTraversal(Node node){
        if(node==null) return;
        System.out.print(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    static void postOrderTraversal(Node node){
        if(node==null) return;
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        System.out.print(node.data);
    }
    static void inOrderTraversal(Node node){
        if(node==null) return;
        preOrderTraversal(node.left);
        System.out.print(node.data);
        preOrderTraversal(node.right);        
    }

    static void breathFirst(Node root){
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        Node node;

        while(!queue.isEmpty()){
            node = queue.poll();
            System.out.print(node.data);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
    }

    public static void main(String  args[]){
        Node root = new Node(1);

        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        System.out.println("Post order");
        postOrderTraversal(root);
        System.out.println("");
        System.out.println("Inorder");
        inOrderTraversal(root);
        System.out.println("");
        System.out.println("Preorder");
        preOrderTraversal(root);


        System.out.println("");
        System.out.println("Breath First");
        breathFirst(root);
    }
}
