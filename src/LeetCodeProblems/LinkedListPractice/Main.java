package LeetCodeProblems.LinkedListPractice;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList(0);
        //ll.printAll();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.printAll();
        System.out.println("The middle node has value:: "+ll.findMiddleNode().value);
    }
}
