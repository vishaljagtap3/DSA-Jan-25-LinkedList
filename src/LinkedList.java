public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (newNode == null) {
            return false;
        }

        //Check if the list is empty, if the list is empty the newNode will become the first node into the list
        if (head == null) {
            head = newNode;
            return true;
        }

        //List is not empty
        //Locate the last node, to locate last node do not use head
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }

        //link the newNode as the next of last node
        last.setNext(newNode);
        return true;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public boolean insert(int data, int position) {
        if(position <= 0) {
            return false;
        }

        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(position == 1) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        //position is greater than 1
        //locate the node at position - 1
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false;
            }
        }

        //prev next will become newNode next
        newNode.setNext(prev.getNext());
        //newNode becomes the next of prev
        prev.setNext(newNode);

        return true;
    }
}
