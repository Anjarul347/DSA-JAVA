package LinkedList;
import java.util.*;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<String> List=new LinkedList<>();
            //To add element to the first
            List.addFirst("a");
            List.addFirst("b");
            List.addFirst("c");

            //To add element to the last
            List.addLast("1");
            List.addLast("2");
            List.addLast("3");
            System.out.println(List);

            List.add("10");
            System.out.println(List);

            // size of the list
            System.out.println(List.size());

            //iterate List using for loop

            for(int i=0;i<List.size();i++){
                System.out.print(List.get(i)+"-->");
            }
            System.out.println("Null");


            //Delete frome first
            List.removeFirst();
            System.out.println(List);

            //Delete from last
            List.removeLast();
            System.out.println(List);

            // Delete element frome the given location

            List.remove(3);
            System.out.println(List);

            List.removeAll(List);
            System.out.println(List);

    }
    
}
