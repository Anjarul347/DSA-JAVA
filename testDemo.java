public class testDemo {

    class Node{
        int Data;
        Node Next;

        Node(int Data){
            this.Data=Data;
            this.Next=null;
        }
    }


    Node head;

    public void addLast(int Data){
        Node newNode=new Node(Data);
        if(head ==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.Next != null){
            currNode=currNode.Next;
        }

        currNode.Next=newNode;
    }

    public void addFirst(int Data){
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
            System.out.println("The list is empty");
            return;
        }

        Node currNode=head;
        while (currNode.Next !=null) {
            System.out.print(currNode.Data + "--> ");
            currNode=currNode.Next;
        }

        System.out.print(currNode.Data);
    }

    public void reverseIteration(){
        if(head==null || head.Next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.Next;
        while(currNode !=null){
            Node nexNode=currNode.Next;
            currNode.Next=prevNode;

            prevNode=currNode;
            currNode=nexNode;
        }

        head.Next=null;
        head=prevNode;


    }

    public static void main(String[] args) {
        testDemo list=new testDemo();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.printList();
        System.out.println();
        list.reverseIteration();
        list.printList();
    }
}
