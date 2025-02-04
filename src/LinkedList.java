import java.util.Stack;

public class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

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

    public boolean deleteByPosition(int position) {
        if(head == null || position <= 0) {
            return false;
        }

        //Head needs to be updated if position is 1
        if(position == 1) {
            head = head.getNext();
            return true;
        }

        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev.getNext() == null) {
                return false;
            }
        }
        Node del = prev.getNext();
        prev.setNext(del.getNext());

        return true;
    }

    public boolean deleteByVal(int data) {
        if(head == null) {
            return false;
        }

        if(head.getData() == data) {
            head = head.getNext();
            return true;
        }

        Node prev = head, del = head;
        while(del.getData() != data) {
            prev = del;
            del = del.getNext();

            if(del == null) {
                return false;
            }
        }

        prev.setNext(del.getNext());
        return true;
    }

    public void displayReverse1() {

        if(head == null) {
            return;
        }

        //locate the last node
        Node last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }
        System.out.print(last.getData() + " ");

        while(last != head) {
            Node temp = head;
            while (temp.getNext() != last) {
                temp = temp.getNext();
            }
            System.out.print(temp.getData() + " ");
            last = temp;
        }
        System.out.println();
    }

    public void displayReverse2() {
        Node temp = head;
        Stack<Node> stack = new Stack<>();

        while(temp != null) {
            stack.push(temp);
            temp = temp.getNext();
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().getData() + " ");
        }
        System.out.println();
    }

    public void displayReverse3(Node temp) {
        if(temp == null) {
            return;
        }

        displayReverse3(temp.getNext());
        System.out.print(temp.getData() + " ");
    }

    public void reverse() {

        if(head == null || head.getNext() == null) {
            return;
        }

        Node n1 = head;
        Node n2 = head.getNext();

        while(n2 != null) {
            Node n3 = n2.getNext();
            n2.setNext(n1);
            n1 = n2;
            n2 = n3;
        }

        head.setNext(null);
        head = n1;
    }
}
