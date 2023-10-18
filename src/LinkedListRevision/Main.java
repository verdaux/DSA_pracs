package LinkedListRevision;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList(0);

        ll.append(1);
        ll.append(2);
        ll.printAll();

        System.out.println("The removed last element is :: "+ll.removeLast().value);
        ll.printAll();

        System.out.println("The removed last element is :: "+ll.removeLast().value);
        ll.printAll();

        System.out.println("The removed last element is :: "+ll.removeLast().value);
        ll.printAll();
    }
}
