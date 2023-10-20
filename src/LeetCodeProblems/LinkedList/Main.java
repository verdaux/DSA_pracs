package LeetCodeProblems.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList(1);

        //ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.printAll();
        System.out.println("The kth node is:: "+ll.findKthFromEnd(2).value);
        //System.out.println("The middle node is:: "+ll.findMiddleNode().value);

        /*System.out.println("The removed last element is :: "+ll.removeLast().value);
        ll.printAll();

        System.out.println("The removed last element is :: "+ll.removeLast().value);
        ll.printAll();

        System.out.println("The removed last element is :: "+ll.removeLast().value);
        ll.printAll();

        System.out.println("The removed last element is :: "+ll.removeLast());
        ll.printAll();*/
    }
}
