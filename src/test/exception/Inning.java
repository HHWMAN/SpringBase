package exception;

import java.io.IOException;

abstract class Inning {

     public Inning() throws BaseBallException{}

     public void event() throws BaseBallException{}

     public abstract void atBat() throws Strike,Foul;

     public void walk() throws IOException{};

}

class StormException extends Exception{}

class RainedOut extends StormException{}

class PopFoul extends Foul {}

