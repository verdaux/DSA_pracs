package Puzzles;

public class PrintArrayFromBothEnds
{
    public static void main(String[] args)
    {
        PrintArrayFromBothEnds printArra = new PrintArrayFromBothEnds();
        int[] sortedArr = {1,2,3,4,5,6,7,8};
        printArra.printKeyValue(sortedArr);
    }

    public void printKeyValue(int[] arr)
    {
        boolean isLengthEven = false;

        if(arr.length%2==0)
        {
            isLengthEven=true;
        }

        int mid = arr.length/2;
        int startIndex = 0;
        int endIndex=arr.length-1;

        if(!isLengthEven)
        {
            for(int i=startIndex, j=endIndex; i<mid && j>mid; i++,j--)
            {
                System.out.println("key:: "+arr[i]+" and value:: "+arr[j]);
            }
        }
        else
        {
            for(int i=startIndex, j=endIndex; i<mid && j>=mid;i++,j--)
            {
                System.out.println("key:: "+arr[i]+" and value:: "+arr[j]);
            }
        }
    }
}
