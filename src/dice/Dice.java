package dice;

import java.util.Random;
import java.util.*;

/**
 * Created by satyaman on 10/7/14.
 */
public class Dice {

    public static int getDice(int start,int end)
    {
        if(start >= end)
            throw new IllegalArgumentException("Start cannot exceed End.");
        Random random = new Random();
        long range = (long)end - (long)start +1;
        log("Range:"+range);
        long fraction = (long)(range * random.nextDouble());
        log("fraction:"+fraction);


        int dice = (int)(fraction + start);
        return dice;

    }
    public static void log(String message)
    {
        System.out.println(message);
    }
    public static void main(String args[])
    {
        log("Dice:"+getDice(1,6));

    }
}
			