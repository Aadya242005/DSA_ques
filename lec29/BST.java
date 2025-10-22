package lec29;
public class BST{
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public BST(int[] arr){
        root = CreateTree(arr,0,arr.length-1);
    }
    private Node CreateTree(int[] arr, int si, int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node nn = new Node();
        nn.val = arr[mid];
        nn.left =  CreateTree(arr,si, mid-1);
        nn.right = CreateTree(arr, mid+1, ei);
        return nn;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,3,4,50,60,70,80};
        BST bst = new BST(arr);

    }
}
