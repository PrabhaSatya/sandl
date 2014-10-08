package traverse;

/**
 * Created by satyaman on 10/8/14.
 */



import grid.Game;

import java.util.logging.*;

public class Main {

    private final static Logger loger = Logger.getLogger(Main.class.getName());

    public static void main(String args[])
    {

            Dice dice = Dice.getInstance();
            int numPlayers = 2;
            int size = 100;
            int diceStart = 1;
            int diceEnd = 6;



            Game game = new Game(size,numPlayers);
            Move move = new Move();

            while(true) {
                for (int i = 0; i < numPlayers; i++) {
                    move.makeMove(game, i, size,diceStart,diceEnd);

                   // loger.log(Level.INFO,"Player Position:" + Integer.toString(game.getPlayerPosition(i)));
                    if (game.getPlayerPosition(i) == size) {
                        loger.log(Level.INFO, "WINNER:" + Integer.toString(i+1));
                        System.exit(-1);
                    }
                }
            }
    }

}
