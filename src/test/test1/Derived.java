package test1;

public class Derived extends Base
{
    public String whenAmISet = "set when declared";

    @Override void preProcess()
    {
        System.out.println(whenAmISet);
        whenAmISet = "set in preProcess()";
        System.out.println(whenAmISet);
    }
}
