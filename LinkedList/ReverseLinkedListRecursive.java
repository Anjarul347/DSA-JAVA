package LinkedList;



public class ReverseLinkedListRecursive {
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

    public void printList(){
        if(head==null){
            System.out.println("The List is empty.");
            return;
        }

        Node curNode=head;
        while (curNode !=null) {
            System.out.print(curNode.Data + "--> ");
            curNode=curNode.Next;
            
        }
        System.out.println("Null");


    }

    public Node reverseRecursive(Node head){
        if(head==null || head.Next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.Next);
        head.Next.Next=head;
        head.Next=null;
        return newHead;
    }

    public static void main(String[] args) {
        ReverseLinkedListRecursive list=new ReverseLinkedListRecursive();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.printList();
        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
    
    
}
