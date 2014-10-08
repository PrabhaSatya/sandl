package traverse;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class DiceTest {

    private final static Logger loger = Logger.getLogger(DiceTest.class.getName());
    @Test
    public void testGetDice( ) throws Exception {


        int start = 1;
        int end = 6;
        Dice dice = Dice.getInstance();
        int diceValue = dice.getDice(start,end);

        assertTrue("start less than diceValue",start<diceValue);
        assertTrue("diceValue less than end",diceValue<end);

        loger.log(Level.INFO,"traverse with in range");

    }
}