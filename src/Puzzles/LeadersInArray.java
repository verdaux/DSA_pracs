package Puzzles;

public class LeadersInArray
{
    public static void main(String[] args)
    {
        LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        lead.printLeaders(arr, n);
    }

    private void printLeaders(int[] arr, int size)
    {
        int max_from_right = arr[size-1];

        System.out.println(max_from_right+" ");

        for (int i=size-2; i>=0;i--)
        {
            if (max_from_right<arr[i])
            {
                max_from_right=arr[i];
                System.out.println(max_from_right+" ");
            }

        }

    }

    private void printLeadersNaive(int[] arr, int size)
    {
        for (int i=0;i<size;i++)
        {
            int j;
            for (j=i+1; j<size;j++)
            {
                if(arr[i]<=arr[j])
                {
                    break;
                }
            }
            if(j == size)
                System.out.println(arr[i] +" ");
        }
    }
}
