package TIcTacToe.strategies.BotPlayingStratrgies;
import TIcTacToe.models.*;


public class EasyPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move decideMove(Player player, Board board) {
       var cells = board.getCells();
       for(int i = 0; i < cells.length; i++){
           for(int j = 0; j < cells.length; j++){
               if(cells[i][j].getPlayer() == null){
                   Move move = new Move(player, i, j);
                   return move;
               }
           }
       }
       return null;
    }
}
