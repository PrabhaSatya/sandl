package dice;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void testGetDice( ) throws Exception {


        int start = 1;
        int end = 6;
        int diceValue = Dice.getDice(start,end);

        assertTrue("start less than diceValue",start<diceValue);
        assertTrue("diceValue less than end",diceValue<end);

        Dice.log("dice with in range");

    }
}