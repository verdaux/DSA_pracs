package LinkedListRepeated;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Test");
        LinkedList ll = new LinkedList(1);
        //ll.printList();
        ll.append(2);
        ll.append(3);
        ll.printList();
        ll.removeLast();
        ll.printList();
    }
}
