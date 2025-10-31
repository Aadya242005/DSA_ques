package lec41;
import java.util.*;
public class Heap {
    private ArrayList<Integer> ll = new ArrayList<>();
    public void Add(int item){
        ll.add(item);
        upheapify(ll.size()-1);          // private method
    }
    private void upheapify(int ci){
        int pi = (ci-1)/2;
        if(ll.get(pi) >ll.get(ci)){
            Swap(pi, ci);
            upheapify(pi);
        }
    }
    private void Swap(int pi, int ci){
        int pith = ll.get(pi);
        int cith = ll.get(ci);
        ll.set(pi, cith);
        ll.set(ci, pith);
    }
    public int remove(){
        Swap(0, ll.size()-1);
        int rv = ll.remove(ll.size()-1);
        downheapify(0);
        return rv;

    }
    public void downheapify(int pi){
        int lci = 2*pi +1;
        int rci = 2*pi+2;
        int mini = pi;
        if(lci<ll.size() && ll.get(lci)<ll.get(mini)){
            mini = lci;
        }
        if(rci<ll.size() &&ll.get(rci)<ll.get(mini)){
            mini = rci;
        }
        if(mini!=pi){
            Swap(pi, mini);
            downheapify(mini);
        }
    }
    public int get(){
        return ll.get(0);
    }
    public int size(){
        return ll.size();
    }
    public void display(){
        System.out.println(ll);
    }

}
