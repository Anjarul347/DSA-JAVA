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
    }
    
}
