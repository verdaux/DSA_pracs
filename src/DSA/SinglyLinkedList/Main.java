package DSA.SinglyLinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList(1);

        ll.prepend(0);

        ll.append(2);
        ll.append(3);

        ll.printAll();
        System.out.println("The middle node is "+ll.middleNode().value);
       //l.insert(0,-15);
       // ll.reverse();
        //ll.printAll();
        /*ll.append(2);
        ll.append(3);
        ll.printAll();
        ll.removeLast();
        ll.printAll();*/
    }
}
