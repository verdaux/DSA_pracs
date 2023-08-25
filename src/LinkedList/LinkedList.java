package LinkedList;

public class LinkedList
{
    private Node head;
    private Node tail;

    private int length;
    public LinkedList(int value)
    {
        Node brandNewNode = new Node(value);
        head = brandNewNode;
        tail = brandNewNode;
        length = 1;
    }

    public void append(int val)
    {
        Node newNode = new Node(val);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast()
    {
        Node temp = head;
        Node pre = head;
        if(length==0)
        {return null;}
        else
        {
            while(temp.next != null)
            {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next=null;
            length--;
            if(length==0)
            {head = null;
            tail = null;}
            return temp;
        }




    }

    public void prepend(int val)
    {
        Node firstNode = new Node(val);
        if(length==0)
        {
            tail=firstNode;
            head=firstNode;
        }
        else
        {
            firstNode.next = head;
            head = firstNode;
        }
    length++;
    }

    public void insert()
    {}

    public void printLL()
    {
        Node temp = head;
        System.out.println("\n Printing LinkedList ::");
        while (temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void getHead()
    {
        System.out.println("Head is :: "+head.value);
    }

    public void getTail()
    {
        System.out.println("Tail is :: "+tail.value);
    }

    public void getLength()
    {
        System.out.println("Total length of the LinkedList is:: "+length);
    }
}
