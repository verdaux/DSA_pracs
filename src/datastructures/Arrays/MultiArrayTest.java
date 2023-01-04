package datastructures.Arrays;

public class MultiArrayTest
{
    public static void main(String[] args)
    {
        MultipurposeArray mpa = new MultipurposeArray(3);
        mpa.insertAtEnd(10);
        mpa.insertAtEnd(20);
        mpa.insertAtEnd(30);
        mpa.insertAtEnd(40);
        mpa.print();
        mpa.size();

    }
}
