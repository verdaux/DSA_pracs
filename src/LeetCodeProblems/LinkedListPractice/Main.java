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
        //System.out.println("The middle node has value:: "+ll.findMiddleNode().value);
        System.out.println("The kth element from end for value is :: "+ll.findKthFromEnd(1).value);

        LinkedList llPartition = new LinkedList(3);
        llPartition.append(8);
        llPartition.append(5);
        llPartition.append(10);
        llPartition.append(2);
        llPartition.append(1);

        llPartition.printAll();

        llPartition.partitionList(5);

        llPartition.printAll();
    }
}
