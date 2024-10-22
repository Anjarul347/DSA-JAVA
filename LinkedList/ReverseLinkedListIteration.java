package LinkedList;

public class ReverseLinkedListIteration {
    Node head;
    class Node{
        int Data;
        Node Next;
        Node(int Data){
            this.Data=Data;
            this.Next=null;
        }

    }

    public void addLast(int Data){
        Node newNode=new Node(Data);

        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while (currNode.Next !=null) {

            currNode=currNode.Next;
            
        }

        currNode.Next=newNode;
    }

    public void reverseIteration(){
        //corner case
        if(head ==null || head.Next==null){
            return;
        }


        Node prevNode=head;
        Node currNode=head.Next;

        while(currNode != null){
            Node nextNode=currNode.Next;
            currNode.Next = prevNode;

            //update

            prevNode=currNode;
            currNode=nextNode;
        }
        head.Next=null;
        head=prevNode;
    }


    public void printList(){
        if(head == null){
            System.out.println("The List is empty.");
            return;
        }

        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.Data + "--> ");
            currNode=currNode.Next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseLinkedListIteration list=new ReverseLinkedListIteration();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.printList();
        list.reverseIteration();
        list.printList();
        
    }
    
}
