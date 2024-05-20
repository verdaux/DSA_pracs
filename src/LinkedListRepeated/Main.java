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
        ll.append(4);
        ll.append(5);
        ll.printList();
        //ll.removeLast();
        //ll.printList();
        //ll.addMiddle(1,8);
        /*ll.prepend(0);
        ll.printList();
        ll.prepend(17);
        ll.printList();*/
        /*ll.removeFirst();
        ll.printList();
        ll.removeFirst();
        ll.printList();
        ll.removeFirst();
        ll.printList();*/
        /*
        System.out.println("The removed Node is:: "+ll.remove(0).value);
        ll.printList();
        System.out.println("The removed Node is:: "+ll.remove(0).value);
        ll.printList();
        System.out.println("The removed Node is:: "+ll.remove(0).value);
        ll.printList();
        */
         //System.out.println("Fetched node at the index is :: "+ll.get(2).value);
        //ll.reverse();
        //ll.set(8,0);
        //ll.printList();
        System.out.println(ll.midddleNode().value);
    }
}
