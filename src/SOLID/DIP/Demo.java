package SOLID.DIP;
//1. High level modules should not depend on low-level modules.
// Both should depend on abstractions.

//2. Abstractions should not depend on details.
// Details should depend on abstractions.
public class Demo
{
    public static void main(String[] args)
    {
        Person parent = new Person("John");
        Person child = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentToChild(parent,child);
        relationships.addParentToChild(parent,child2);

        new Research(relationships);
    }
}
