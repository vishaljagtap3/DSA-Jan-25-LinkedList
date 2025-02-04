public class Main {
    public static void main(String[] args) {

        /*Node n1 = new Node(10);
        Node n2 = new Node(20);*/

        LinkedList l1 = new LinkedList();
        l1.display();
        l1.insert(10);
        l1.display();
        l1.insert(20);
        l1.display();
        l1.insert(30);
        l1.display();
        l1.insert(40);
        l1.display();
        l1.insert(50);
        l1.display();
        l1.insert(60, 1);
        l1.display();
        l1.insert(70, 4);
        l1.display();
        l1.insert(80, 8);
        l1.display();
        l1.insert(90, 11);
        l1.display();

//        l1.deleteByPosition(1);
//        l1.display();
//        l1.deleteByPosition(4);
//        l1.display();
//        l1.deleteByPosition(6);
//        l1.display();
//        System.out.println(
//            l1.deleteByPosition(6)
//        );
//        l1.display();

        l1.displayReverse1();
        l1.displayReverse2();
        l1.displayReverse3(l1.getHead());
        System.out.println();

        l1.reverse();
        l1.display();
    }
}
