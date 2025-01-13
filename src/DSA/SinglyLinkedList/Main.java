package DSA.SinglyLinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList(1);
        ll.printAll();
        ll.prepend(0);
        ll.printAll();
        ll.prepend(-1);
        ll.printAll();
        /*ll.append(2);
        ll.append(3);
        ll.printAll();
        ll.removeLast();
        ll.printAll();*/
    }
}
