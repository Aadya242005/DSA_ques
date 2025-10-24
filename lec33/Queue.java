package lec33;

public class Queue {
    private int[] arr;
    private int front =0;
    private int size=0;
    public Queue(){
        arr = new int[5];
    }
    public Queue(int n){
        arr = new int[n];
    }
    public boolean Isempty(){
        return size ==0;
    }
    public void Enqueue(int item) throws Exception{
        if(isfull()){
            throw new Exception("bklol queue full h");
        }
        int idx = (front + size)%arr.length;
        arr[size] = item;
        size++;
    }
    public int Dequeue(){
        int rv = arr[front];
        front=(front+1)%arr.length;
        size--;
        return rv;

    }
    public int getfront(){
        int rv = arr[front];
        return rv;
    }
    public boolean isfull(){
        return size == arr.length;
    }
    public int size(){
        return size;
    }
    public void Display(){
        for(int i=0; i<size; i++){
            int idx = (front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
    }

    
}
