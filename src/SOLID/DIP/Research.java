package SOLID.DIP;

import org.javatuples.Triplet;

import java.util.List;

public class Research // High-level module
{
    /*public Research(Relationships relationships)
    {
        //violates dependency inversion as it calls getRelations method -> which exposes implementation
        //If you want to change List to arrays or not use Triplets, a lot of changes would be required.
        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
        relations
                .stream()
                .filter(x -> x.getValue0().name.equals("John")
                        &&
                        x.getValue1() == Relationship.PARENT
                )
                .forEach(ch -> System.out.println(
                        "John has a child called "+ch.getValue2().name
                ));
    }*/

    public Research(RelationshipBrowser browser)
    {
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children)
        {
            System.out.println("John has a child called:: "+child.name);
        }
    }
}
