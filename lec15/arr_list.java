package lec15;
import java.util.*;
public class arr_list {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList();
        System.out.println(list);
        //Add
        list.add(10);
        list.add(20);     
        list.add(30);        //cont we can not skip index
        System.out.println(list);
        list.add(1,-9);
        System.out.println(list);
        System.out.println(list.get(3));  // gives index
        System.out.println(list.remove(3)); 
        System.out.println(list); 
        list.add(201);
        list.add(3);     
        list.add(21); 
        list.add(33);
        System.out.println(list);
        list.set(4,-11); //update element at index
        System.out.println(list);
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
        ArrayList<String> ll = new ArrayList<>();
        ll.add("Ankit");
        ll.add("Yachu");
        ll.add("Raj");
        Collections.sort(ll);
        System.out.println(ll);
        for(int i=0; i<ll.size();i++){
            System.out.print(ll.get(i)+" ");
        }
        System.out.println();
        for(int val: list){
            System.out.print(val + " ");
        }   
    } 
}
