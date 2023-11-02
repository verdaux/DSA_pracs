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
}
