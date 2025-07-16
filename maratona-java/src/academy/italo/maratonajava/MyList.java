package academy.italo.maratonajava;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MyList {
    private Node head;

    public void addFinal(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }

    public void addBegin(int data){
        Node newNode = new Node (data);
        newNode.next = head;
        head = newNode;
    }

    public void remove(int data){
        if(head == null) return;

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

}



