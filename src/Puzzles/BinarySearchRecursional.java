package Puzzles;

public class BinarySearchRecursional
{
    public static void main(String[] args)
    {
        BinarySearchRecursional bs = new BinarySearchRecursional();

        int[] arr = {1,2,3,4,5,11,14,16,21,34,55,100};
        int searchNumber = 21;
        int indexOfNum = bs.searchRecursively(0,arr.length,arr,searchNumber);
        System.out.println("number "+searchNumber+" is present at index "+indexOfNum+" in the array");
    }

    public int searchRecursively(int startIndex, int endIndex, int[] arr, int numToSearch)
    {
        int mid = startIndex + ((endIndex-startIndex)/2);
        int numAtIndex=-1;

        if(endIndex<startIndex)
        {
            return numAtIndex;
        }

        if(numToSearch == arr[mid])
        {
            return mid;
        }
        else if (numToSearch < arr[mid])
        {
            return searchRecursively(startIndex,mid-1,arr,numToSearch);
        }
        else
        {
            return searchRecursively(mid+1,endIndex,arr,numToSearch);
        }

    }
}
