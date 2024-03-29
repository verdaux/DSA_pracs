package LeetCodeProblems.LinkedList;

import java.util.HashSet;
import java.util.Set;

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

    public Node findKth(int k)
    {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i< k ; i++)
        {
            if (fast == null)
            {
                return null;
            }
            fast = fast.next;
        }

        while (fast !=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public void partitionList(int x)
    {
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;
        while (current!=null)
        {
            if(current.value < x)
            {
                prev1.next = current;
                prev1 = current;
            }
            else
            {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;
        head = dummy1.next;
    }

    public void removeDupes()
    {
        Set<Integer> values = new HashSet<Integer>();
        Node current = head;
        Node prev = null;
        while (current!=null)
        {
            if(values.contains(current.value))
            {
                prev.next = current.next;
            }
            else
            {
                values.add(current.value);
                prev = current;
            }
            current = current.next;
        }
    }
    public void removeDuplicates()
    {
        Node curr = head;
        while (curr!=null)
        {
            Node runner = curr;
            while (runner.next!=null)
            {
                if (runner.next.value == curr.value)
                {
                    runner.next = runner.next.next;
                    length--;
                }
                else
                {
                    runner = runner.next;
                }
            }
            curr = curr.next;
        }
    }

    public int binaryToDecimal()
    {
        int num = 0;
        Node temp = head;
        while(temp!=null)
        {
            num = num * 2 + temp.value;
            temp = temp.next;
        }
        return num;
    }

    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null) return;

        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;

        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        Node currentNode = previousNode.next;

        for (int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = currentNode.next;
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }

        head = dummyNode.next;
    }
}
