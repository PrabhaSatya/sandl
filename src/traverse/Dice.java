package traverse;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by satyaman on 10/7/14.
 */
public class Dice {


    private static Dice dice = new Dice();

    private final static Logger loger = Logger.getLogger(Dice.class.getName());

    private Dice() {}

    public static Dice getInstance()
    {
        return dice;
    }

    Random random = new Random();

    public int getDice(int start, int end)
    {
        if(start >= end)
            throw new IllegalArgumentException("Start cannot exceed End.");
        int dice = random.nextInt(end)+start;
        loger.log(Level.INFO,"dice Value:"+Integer.toString(dice));
        return dice;
    }

}


			