package LeetCodeProblems.LinkedList;

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
        length = 1;
    }

    public int getLength()
    {
        System.out.println("The length of the LinkedList is :: "+length);
        return length;
    }

    public Node getHead()
    {
        System.out.println("The head for LinkedList has a value of :: "+head.value);
        return head;
    }

    public Node getTail()
    {
        System.out.println("The tail for LinkedList has a value of :: "+tail.value);
        return tail;
    }

    public void printList()
    {
        System.out.println("The linked list has below values:: ");
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll()
    {
        System.out.println("\n");
        if(length>0)
        {
            getLength();
            getHead();
            getTail();
            printList();
        }
        else
        {
            System.out.println("The linked list is empty!");
        }
        System.out.println("\n");
    }

    public void append(int value)
    {
        Node newLastNode = new Node(value);
        if(length==0)
        {
            head = newLastNode;
            tail = newLastNode;
        }
        else
        {
            tail.next = newLastNode;
            tail = newLastNode;
        }
        length++;
    }

    public Node removeLast()
    {
        Node prev = head;
        Node temp = head;
        if(length == 1)
        {
            //temp = prev;
            head=null;
            tail=null;
            length--;
        }
        else if (length>0)
        {
            while (temp != tail)
            {
                prev = temp;
                temp = temp.next;
            }
            tail = prev;
            prev.next = null;
            length--;
        }
        else
        {
            System.out.println("The list is empty so remove operation is skipped!");
        }
        return temp;
    }

    public Node findMiddleNode()
    {

            Node slow = head;
            Node fast = head;

            while(
                    (fast!=null)
                    &&
                    (fast.next != null)
            )
            {
                slow = slow.next;
                fast = fast.next.next;
            }

        return slow;
    }

    public boolean hasLoop()
    {
        Node slow = head;
        Node fast = head;

        while (
                (fast != null)
                        &&
                        (fast.next != null)
        )
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }

    public Node findKthFromEnd(int k)
    {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++)
        {
            if(fast==null)
            {return null;}
            fast = fast.next;
        }

        while (fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
