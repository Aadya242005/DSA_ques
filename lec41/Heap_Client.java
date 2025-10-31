package lec41;

public class Heap_Client {
    public static void main(String[] args) {
        Heap h = new Heap();
        h.Add(10);
        h.Add(20);
        h.Add(30);
        h.Add(1);
        h.Add(5);
        h.Add(7);
        h.Add(3);
        h.Add(2);
        h.Add(-4);
        h.display();
        System.out.println(); 
        System.out.println(h.remove());
        System.out.println();
        h.display();
     
        
    }
    
}
