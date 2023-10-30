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
        //System.out.println("The kth node is:: "+ll.findKth(5).value);

        LinkedList ll1 = new LinkedList(3);
        ll1.append(5);
        ll1.append(8);
        ll1.append(10);
        ll1.append(2);
        ll1.append(1);
        //System.out.println("Before partition:: ");
        //ll1.printAll();
        //System.out.println("After partition:: ");
        //ll1.partitionList(5);
        //ll1.printAll();

        //test remove dupes
        LinkedList ll2 = new LinkedList(3);
        ll2.append(5);
        ll2.append(1);
        ll2.append(7);
        ll2.append(2);
        ll2.append(3);
        ll2.append(8);
        ll2.append(5);
        System.out.println("Before remove dupes:: ");
        ll2.printAll();
        System.out.println("After remove dupes:: ");
        ll2.removeDuplicates();
        ll2.printAll();
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
