package datastructures.Arrays;

public class ResizableArrayTest
{
    public static void main(String[] args)
    {
        ResizableArray arr = new ResizableArray(3);
        arr.append("element1 ");
        arr.append(20);
        arr.append(30);
        arr.append(40);
        System.out.println("after adding...");
        arr.printArray();
        arr.removeAt(1);
        System.out.println("after deleting...");
        arr.printArray();
        arr.insertAtIndex(1,20);
        System.out.println("after inserting at index...");
        arr.printArray();
    }
}
