package DSA.SinglyLinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList(1);
        ll.printAll();
        ll.prepend(0);

        ll.append(2);
        ll.append(3);

        ll.printAll();

        System.out.println("value at index 2 is :: "+ll.get(2).value);
        System.out.println("value at index 1 is :: "+ll.get(1).value);
        System.out.println("value at index 3 is :: "+ll.get(3).value);
        System.out.println("value at index 15 is :: "+(ll.get(15)==null?" is null":ll.get(15).value));
        /*ll.append(2);
        ll.append(3);
        ll.printAll();
        ll.removeLast();
        ll.printAll();*/
    }
}
