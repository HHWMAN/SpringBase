package exception;

import java.io.IOException;

public class StormyInning extends Inning implements  Storm {

    public StormyInning() throws RainedOut,BaseBallException,IOException{}

    public StormyInning(String s) throws RainedOut,BaseBallException{}

    public void walk() {}

    public void event() { }

    @Override
    public void rainHard() throws RainedOut {

    }

    public void atBat() throws PopFoul,Strike{}
    //public void atBat() throws PopFoul,Strike,IOException{}
    Error e = new Error();


}
