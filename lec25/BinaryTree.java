package lec25;
import java.util.*;

public class BinaryTree {
    class Node{
        int val;
        Node left;
        Node right; 
    }
    private Node root;
    Scanner sc = new Scanner(System.in);

    public BinaryTree(){
        root = CreateTree();
    }
    private Node CreateTree(){
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if(hlc){
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = CreateTree();
        }
        return nn;
    }
    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if(nn==null){
            return;
        }
        String s ="";
        s = "<--"+nn.val + "-->";
        if(nn.left!=null){
            s = nn.left.val + s;
        }else{
            s="."+s;
        }
        if(nn.right!=null){
            s=s+nn.right.val;

        }else{
            s=s+".";
        }
        System.out.println();
    }
    public int max(){
        return max(root);
    
    }
    private int max(Node node){
        if(node ==null){
            return Integer.MIN_VALUE;
        }
        int lmax = max(node.left);
        int rmax = max(node.right);
        return Math.max(node.val, Math.max(lmax, rmax));
    }
    public boolean find(int item){
        return find(this.root, item);
    }
    private boolean find(Node nn, int item){
        if(nn==null){
            return false;
        }
        if(nn.val == item){
            return true;
        }
        boolean left = find(nn.left, item);
        boolean right= find(nn.right, item);
        return left || right;
    }
    public int ht(){
        return ht(this.root);
    }
    private int ht(Node node){
        if(node==null){
            return-1; 
        }
        int lh = ht(node.left);
        int rh = ht(node.right);
        return Math.max(lh, rh) +1;
    }
    public void PreOrder(){
        PreOrder(this.root);
        System.out.println();
    }
    private void PreOrder(Node node){
        if(node == null){
            return;   
        }
        System.out.println(node.val +" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public void INOrder(){
        INOrder(this.root);
        System.out.println();
    }
    private void INOrder(Node node){
        if(node == null){
            return;
        }
        INOrder(node.left);
        System.out.println(node.val + " ");
        INOrder(node.right);
    }
    public void POStOrder(){
        POStOrder(this.root);
        System.out.println();
    }
    private void POStOrder(Node node){
        if(node == null){
            return;
        }
        POStOrder(node.left);
        POStOrder(node.right);
        System.out.println(node.val+" ");

    }
    public void levelOrder(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv = q.remove();
            System.out.println(rv.val + " ");
            if(rv.left !=null){
                q.add(rv.left);
            }
            if(rv.right !=null){
                q.add(rv.right);
            }
        }
        System.out.println();
    }
}

