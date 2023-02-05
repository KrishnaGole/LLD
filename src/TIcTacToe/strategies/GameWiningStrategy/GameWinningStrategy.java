package TIcTacToe.strategies.GameWiningStrategy;
import TIcTacToe.models.*;


public interface GameWinningStrategy {
    GameState checkForWinner(Board board, Player player, Cell cell);
}
