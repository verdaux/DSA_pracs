package LinkedList;

public class LLMain
{
    public static void main(String[] args)
    {
        LinkedList myLL = new LinkedList(1);
        myLL.append(2);
        myLL.append(3);
        myLL.append(4);
        myLL.append(5);
        myLL.printLL();
        System.out.println(" new value inserted at index is :: "+myLL.insert(1,10));
        //System.out.println(" value at index is :: "+myLL.set(1,10));
        myLL.printLL();
        //System.out.println(" value at index is :: "+myLL.get(1).value);
        /*myLL.getHead();
        myLL.getTail();
        myLL.getLength();
        myLL.printLL();
        myLL.append(2);

        myLL.getHead();
        myLL.getTail();
        myLL.getLength();
        myLL.printLL();*/
        //System.out.println("removed value is :: "+myLL.removeFirst().value);
        //System.out.println("removed value is :: "+myLL.removeFirstAlt().value);
        /*
        System.out.println("removed value is :: "+myLL.removeLast().value);
        System.out.println("removed value is :: "+myLL.removeLast().value);
        System.out.println("removed value is :: "+myLL.removeLast());
        */
        /*myLL.prepend(3);
        myLL.getHead();
        myLL.getTail();
        myLL.getLength();
        myLL.printLL();
        System.out.println("removed value is :: "+myLL.removeFirstAlt().value);
        myLL.getHead();
        myLL.getTail();
        myLL.getLength();
        myLL.printLL();
        System.out.println("removed value is :: "+myLL.removeFirstAlt().value);
        myLL.getHead();
        myLL.getTail();
        myLL.getLength();
        myLL.printLL();*/
        LLMain lll = new LLMain();
        //lll.equalsChecker();
    }

    public void equalsChecker()
    {
        String s1 = new String("sonu");
        String s2 = new String("sonu");
        String s3 = "sonu";
        if(s1==s3)
        {
            System.out.println("strings objects are equals");
        }
        System.out.println(s1==s2?"s1,s2 is true for double equals":"s1,s2 false for double equals");
        System.out.println(s1.equals(s2)?"s1,s2 is true for dot equals":"s1,s2 false for dot equals");

        System.out.println(s1==s3?"s1,s3 is true for double equals":"s1,s3false for double equals");
        System.out.println(s1.equals(s3)?"s1,s3 is true for dot equals":"s1,s3 false for dot equals");

        s2=s3;
        System.out.println("\ns2 assigned to s3 start -------------");
        System.out.println(s1==s2?"s1 s2 is true for double equals":"s1,s2 false for double equals");
        System.out.println(s1.equals(s2)?"s1 s2 is true for dot equals":"s1,s2 false for dot equals");

        System.out.println(s2==s3?"s2 s3 is true for double equals":"s2,s3 false for double equals");
        System.out.println(s2.equals(s3)?"s2 s3 is true for dot equals":"s2,s3 false for dot equals");
        System.out.println("s2 assigned to s3 end ------------- \n");
        String s4 = new String("monu");
        s1=s4;
        System.out.println(s1==s4?"s1 s4 is true for double equals":"s1,s4 false for double equals");
    }

}
