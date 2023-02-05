package TIcTacToe.strategies.BotPlayingStratrgies;

import TIcTacToe.models.*;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
