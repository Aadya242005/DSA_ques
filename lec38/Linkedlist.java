package lec38;

public class Linkedlist {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size; 
// O(1)
    public void AddFirst(int item){
        Node nn = new Node(); //new node 
        nn.data = item;    // add data in it from 0 to 10
        if(size==0){
            head = nn;
            tail = nn;
            size++;
        }else{
            nn.next = head;
            head = nn;
            size++;
        }
    }
    public void AddLast(int item){
        if(size ==0){
            AddFirst(item);
        }else{
            Node nn = new Node();
            nn.data = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }
    //O(N)
    public void AddIndex(int item, int k)throws Exception{
        if(k==0){
            AddFirst(item);
        }else if(k==size){
            AddLast(item);
        }else{
            Node nn = new Node();
            nn.data = item;
            Node k_th = GetNode(k-1);
            nn.next=k_th.next;
            k_th.next = nn;
            size++;
        }
    } 
    public int getfirst(){
        return head.data;

    }
    public int getLast(){
        return tail.data;
    }
    //O(N)
    public int getindex(int k)throws Exception{
        return GetNode(k).data;
    }
    public int removefirst(){
        int rv = head.data; 
        if(size ==1){
            head = null;
            tail = null;
            size++;
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        size--;
        return rv;
    }
    public int removeLast()throws Exception{
        if(size==1){
            return removefirst();
        }else{
            int rv = tail.data;
            Node sl = GetNode(size-2);
            sl.next = null;
            tail = sl;
            size++;
            return rv; 
        }
    }
    public int removeindex(int k) throws Exception{
        if(k==0){
            return removefirst();

        }else if (k==size-1){
            return removeLast();
        }else{
            Node k_th = GetNode(k-1);
            Node kth= k_th.next;
            k_th.next = null;
            size--;
            return kth.data;
        }

    }
    //O(N)
    public void Display(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println(".");
    } 
    private Node GetNode(int k) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Bklol index" + k);

        }
        Node temp = head;
        for(int i=1;i<=k;i++){
            temp = temp.next;
        }
        return temp;

    } 
}
