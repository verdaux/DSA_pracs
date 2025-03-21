package SOLID.SRP;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BadJournal
{
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text)
    {
        entries.add(""+(++count)+": "+text);
    }

    public void removeEntry(int index)
    {
        entries.remove(index);
    }


    @Override
    public String toString()
    {
        return String.join(System.lineSeparator(),entries);
    }

    public void save(String fileName) throws FileNotFoundException
    {
        try(PrintStream out = new PrintStream(fileName))
        {
            out.println(toString());
        }
    }

    public void load(String fileName){}
    public void load(URL url){}
}
