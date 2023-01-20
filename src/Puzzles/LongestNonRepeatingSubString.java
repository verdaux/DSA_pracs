package Puzzles;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestNonRepeatingSubString
{
    public static void main(String[] args)
    {
        longestSubstring("javaconceptoftheday");

        System.out.println("==========================");

        longestSubstring("abcdeab");

    }

    private static void longestSubstring(String input)
    {
        char[] splittedInput = input.toCharArray();

        LinkedHashMap<Character,Integer> charPosMap = new LinkedHashMap<Character,Integer>();

        String longestUniqueString = null;
        int longestUniqueStringLength = 0;

        for (int i =0; i<splittedInput.length; i++)
        {
            if(!charPosMap.containsKey(splittedInput[i]))
            {
                charPosMap.put(splittedInput[i],i);
            }
            else
            {
                i=charPosMap.get(splittedInput[i]);
                charPosMap.clear();
                longestUniqueStringLength=0;
            }
        }

        longestUniqueString = charPosMap.keySet().toString();
        System.out.println("longestUniqueString:: "+longestUniqueString);
    }
}
