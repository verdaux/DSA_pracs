package LeetCodeProblems.LinkedListRepeated;

public class LinkedList
{
    Node head;
    Node tail;
    int size;
    public LinkedList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null)
        {
            System.out.println("empty");
        }
        else
        {
            printList();
        }
    }

    private void printList()
    {
        Node temp = head;
        for (int i = 0 ; i < size; i++)
        {
            System.out.println(temp.value);
        }
    }

    public Node findKthFromEnd(int k)
    {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++)
        {
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
