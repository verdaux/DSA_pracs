package LinkedListPractice;

public class LinkedList
{
    Node head;
    Node tail;
    int length;
    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =1;
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
}
