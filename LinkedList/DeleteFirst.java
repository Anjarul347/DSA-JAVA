package LinkedList;

public class DeleteFirst {
    Node head;
    class Node{
        int Data;
        Node Next;

        Node(int Data){
            this.Data=Data;
            this.Next=null;
        }
    }

    //Adding node at the end

    public void addList(int Data){
        Node newNode=new Node(Data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode=head;
        while(currNode.Next !=null){
            currNode=currNode.Next;
        }

        currNode.Next=newNode;
    }

    //printing the list

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


    //Delete element from first

    public void delFirst(){
        if(head== null){
            System.out.println("The list is already empty.");
            return;
        }
        head=head.Next;
    }

    public static void main(String[] args) {
        DeleteFirst list=new DeleteFirst();

        list.addList(1);
        list.addList(2);
        list.addList(3);
        list.addList(4);
        list.addList(5) ;

        list.delFirst();
        list.printList();
    }
}
