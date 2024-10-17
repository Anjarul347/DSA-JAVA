package LinkedList;

//Adding element at the starting of the list

public class AddToStart {
    class Node{
        int Data;
        Node Next;
        Node(int Data){
            this.Data=Data;
            this.Next=null;
        }

    }
    Node head;

    public void addList(int Data){
        Node newNode=new Node(Data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.Next=head;
        head=newNode;

    }


    public void printList(){
        if(head==null){
            System.out.println("The List is empty.");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.Data + "--> ");
            currNode=currNode.Next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        AddToStart List=new AddToStart();
       
        List.addList(10);
        List.addList(20);
        List.addList(30);
        List.addList(40);
        List.addList(50);
        List.addList(60);
      
        List.printList();
    }
}
