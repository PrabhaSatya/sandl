package grid;

/**
 * Created by satyaman on 10/8/14.
 */
public class Game {


    int numPlayers;
    int board[];
    int playerPositions[];


    public Game(int size, int numPlayers)
    {
        this.board = new int[size];
        board[30] = 50;
        board[51] = 40;
        this.numPlayers = numPlayers;
        this.playerPositions = new int[numPlayers];
        //java.util.Arrays.fill(playerPositions,1);
    }

    public int getBoard(int idx) {
        return board[idx];
    }

    public void setBoard(int idx, int value) {
        this.board[idx] = value;
    }

    public int getPlayerPosition(int player) {
        return playerPositions[player];
    }

    public void setPlayerPosition(int player, int playerPosition) {
        this.playerPositions[player] = playerPosition;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

}
