package General;

public class TryFinallyReturnCheck
{
    public static void main(String[] args)
    {
        TryFinallyReturnCheck trfc = new TryFinallyReturnCheck();
        int returned = trfc.checkTryFinally();
        System.out.println("returned from method call:: "+returned);
    }

    public int checkTryFinally()
    {
        try
        {
            //int i=(1/0);
            System.out.println("in try");
            return 1;
        }
        finally
        {
            System.out.println("in finally");
            return 2;
        }
    }
}
