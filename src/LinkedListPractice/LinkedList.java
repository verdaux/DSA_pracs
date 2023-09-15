package LinkedListPractice;

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
        length =1;
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

    public void printList()
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll()
    {
        if(length==0)
        {
            System.out.println("The linked list is empty");
        }
        else
        {
            System.out.println("The head element has value:: "+getHead().value);
            System.out.println("The tail element has value:: "+getTail().value);
            System.out.println("The length of the linked list is:: "+getLength());

            System.out.println("The elements of linked list are as follows: \n");
            printList();
        }
    }
}
