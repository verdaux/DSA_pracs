package SOLID.SRP;

import java.io.FileNotFoundException;

public class Demo
{
    public static void main(String[] args)
    {
        Journal j = new Journal();
        j.addEntry("I was happy today.");
        j.addEntry("I went to walk in the park.");
        System.out.println(j);

        /*BadJournal bj = new BadJournal();
        bj.addEntry("I");
        bj.addEntry("Am");
        try
        {
            bj.save("Journals");
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }*/
    }
}
