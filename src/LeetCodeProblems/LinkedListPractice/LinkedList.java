package LeetCodeProblems.LinkedListPractice;

public class LinkedList
{
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }

    public Node getHead()
    {
        return head;
    }

    public Node getTail()
    {
        return tail;
    }

    public int getLength()
    {
        return length;
    }

    public void printAll()
    {
        if (length>0)
        {
            System.out.println("The head Node has value :: "+getHead().value);
            System.out.println("The tail Node has value:: "+getTail().value);
            System.out.println("The length of the Linked List is :: "+getLength());
            System.out.println("The values of Linked List are as follows:: ");
            Node temp = head;
            while (temp!=null)
            {
                System.out.println(temp.value);
                temp = temp.next;
            }
            System.out.println();
        }
        else
        {
            System.out.println("The Linked List is empty! \n");
        }
    }

    public void append(int value)
    {
        Node lastNode = new Node(value);
        if (length==0)
        {
            head=lastNode;
            tail=lastNode;
        }
        else
        {
            tail.next = lastNode;
            tail=lastNode;
        }
        length++;
    }
    /*
    * Implement a method called findMiddleNode that returns the middle node of the linked list.
      If the list has an even number of nodes, the method should return the second middle node.
     */
    public Node findMiddleNode()
    {

        if (length>1)
        {
            Node fast = head;
            Node slow = head;

            while (fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
        else if (length==1)
        {
            return head;
        }
        else
        {
            return null;
        }
    }

    /*
    Write a method called hasLoop that is part of the linked list class.
    The method should be able to detect if there is a cycle or loop present in the linked list.
    The method should utilize Floyd's cycle-finding algorithm, also known as the "tortoise and hare" algorithm, to determine the presence of a loop efficiently.
     */
    public boolean hasLoop()
    {
        Node fast = head;
        Node slow = head;
        while
        (
                fast!=null
                &&
                        fast.next!=null
        )
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow==fast)
            {
                return true;
            }
        }
        return false;
    }

    public Node findKthFromEnd(int k)
    {
        Node fast = head;
        Node slow = head;
        for (int i=0; i < k; i++)
        {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
