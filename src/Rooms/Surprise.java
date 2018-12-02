package Rooms;
import Game.Runner;
import People.Person;

public class Surprise extends Room
{
    public Surprise(int x, int y)
    {
        super(x,y);
    }

    public void enterRoom(Person x)
    {
        System.out.println("SURPRISE! YOU BETTER RUN HAHAHA");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
}
