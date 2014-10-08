package dice;

/**
 * Created by satyaman on 10/8/14.
 */



import java.util.logging.*;

public class Main {

    private final static Logger loger = Logger.getLogger(Main.class.getName());




    public static void main(String args[])
    {

            Dice dice = new Dice();
            loger.setLevel(Level.FINE);
            loger.log(Level.INFO,"DiceValue:"+dice.getDice(1,6));
            loger.log(Level.INFO,"DiceValue:"+dice.getDice(1,6));



    }


}
