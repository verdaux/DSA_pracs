package DoublyLinkedList;

public class Main
{
    public static void main(String[] args)
    {
        DoublyLinkedList ll = new DoublyLinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.printAll();
        //ll.set(0,14);
        ll.remove(1);
        ll.printAll();
        /*System.out.println("fetched value:: "+ll.get(0).value);
        System.out.println("fetched value:: "+ll.get(1).value);
        System.out.println("fetched value:: "+ll.get(2).value);*/
        /*System.out.println("The removed node has value:: "+ll.removeLast().value);
        ll.printAll();*/

        /*ll.prepend(0);
        ll.prepend(-1);
        ll.printAll();*/

        /*System.out.println("\nThe removed first node has value:: "+ll.removeFirst().value+"\n");
        System.out.println("\nThe removed first node has value:: "+ll.removeFirst().value+"\n");
        System.out.println("\nThe removed first node has value:: "+ll.removeFirst().value+"\n");*/
        //ll.printAll();
    }
}
