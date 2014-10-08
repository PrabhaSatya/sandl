package traverse;

import grid.Game;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by satyaman on 10/8/14.
 */
public class Move {


    private final static Logger loger = Logger.getLogger(Move.class.getName());

    public int makeMove(Game game,int player,int boardEnd,int diceStart,int diceEnd)
    {
        Dice dice = Dice.getInstance();
        int nextPosition;
        int currentPosition = game.getPlayerPosition(player);
        int diceValue = dice.getDice(diceStart,diceEnd);

        nextPosition = currentPosition+diceValue;

        loger.log(Level.INFO,"CurrentPosition:"+Integer.toString(currentPosition));
        loger.log(Level.INFO,"NextPosition:"+Integer.toString(nextPosition));

        if(nextPosition >= boardEnd)
        {
            game.setPlayerPosition(player,boardEnd);
            return  game.getPlayerPosition(player);
        }
        int boardValuePostMove = game.getBoard(nextPosition);

        loger.log(Level.INFO,"BoardValuePostMove"+Integer.toString(boardValuePostMove));

        if(boardValuePostMove >= boardEnd)
        {
            game.setPlayerPosition(player,boardEnd);
            return game.getPlayerPosition(player);
        }
        else if(boardValuePostMove == 0)
        {
            game.setPlayerPosition(player,nextPosition);
         //   loger.log(Level.INFO,"playerposition in move.java:"+Integer.toString(game.getPlayerPosition(player)));
            return game.getPlayerPosition(player);

        }
        else
        {
            game.setPlayerPosition(player,boardValuePostMove);
            return game.getPlayerPosition(player);
        }

    }
}
