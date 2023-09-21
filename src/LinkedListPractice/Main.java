package LinkedListPractice;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList(1);
        //LinkedList ll1 = new LinkedList(2);
        //LinkedList ll2 = new LinkedList(3);

        ll.printAll();
        //ll1.printAll();
        //ll2.printAll();

        /*

        //invoking prepend and remove first code

        System.out.println("new first value added:: ");
        ll1.prepend(1);
        ll1.printAll();
        System.out.println("new first value added:: ");
        ll1.prepend(0);
        ll1.printAll();

        System.out.println("first value removed:: "+ll1.removeFirst().value);
        ll1.printAll();
        System.out.println("first value removed:: "+ll1.removeFirst().value);
        ll1.printAll();
        System.out.println("only value removed:: "+ll1.removeFirst().value);
        ll1.printAll();
        System.out.println("Attempting removal on empty list:: "+ll1.removeFirst());
        ll1.printAll();
        */

        //invoking append and remove last code
        ll.append(2);
        ll.printAll();
        ll.append(3);
        ll.printAll();

        System.out.println("Last value removed:: "+ll.removeLast().value);
        ll.printAll();
        System.out.println("Last value removed:: "+ll.removeLast().value);
        ll.printAll();
        System.out.println("Only value removed:: "+ll.removeLast().value);
        ll.printAll();
        System.out.println("Empty list removed:: "+ll.removeLast());
        ll.printAll();
    }
}
