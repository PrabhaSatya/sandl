package dice;

import java.util.Random;

/**
 * Created by satyaman on 10/7/14.
 */
public class Dice {
    Random random = new Random();

    public int getDice(int start, int end)
    {
        if(start >= end)
            throw new IllegalArgumentException("Start cannot exceed End.");
        int dice = random.nextInt(end)+start;
        return dice;
    }

}


			