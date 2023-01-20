package Puzzles;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArr
{
    public static void main(String[] args)
    {
        List<Integer> list = List.of(3,17,5,13,4,9,2,1);

        LeaderInArr lia = new LeaderInArr();
        lia.findLeader(list, list.size());
    }

    public void findLeader(List<Integer> list, int listSize)
    {
        int leader_element = list.get(listSize-1);
        System.out.println(leader_element+" ");

        for(int i=listSize-2;i>=0;i--)
        {
            if(leader_element<list.get(i))
            {
                leader_element=list.get(i);
                System.out.println(leader_element+" ");
            }
        }

    }
}
