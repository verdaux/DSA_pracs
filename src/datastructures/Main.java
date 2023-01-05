package datastructures;

public class Main 
{
    public static void main(String[] args) 
    {
        printItems(10);
        int[] numArr = {1,5,7,22};

        printArray(numArr);
    }
    
    public static void printItems(int n)
    {
        for (int i=0;i<n;i++)
        {
            System.out.println(i);
        }
    }

    public static void printArray(int[] inputArr)
    {
        for(int num : inputArr)
        {
           System.out.println(num);
        }
    }
}
