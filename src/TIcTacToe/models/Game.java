package TIcTacToe.models;

import TIcTacToe.exceptions.InvalidGameArgumentsException;
import TIcTacToe.strategies.GameWiningStrategy.GameWinningStrategy;
import TIcTacToe.strategies.GameWiningStrategy.OrderNGameWinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
     private Board board;
     private List<Player> players;
     private int turn;
     private List<Move> moves;
     private GameState gameState;
     private Player winner;
     private GameWinningStrategy gameWinningStrategy;

    public Board getBoard() {
        return board;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public int getTurn() {
        return turn;
    }
    public List<Move> getMoves() {
        return moves;
    }
    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    private Game(int dimension, List<Player> players){
        //making use of builder necessary
        this.board = new Board(dimension);
        this.players = players;
        this.turn = 0;
        this.moves = new ArrayList<>();
        this.gameState =GameState.InProgress;
        this.gameWinningStrategy = new OrderNGameWinningStrategy();
    }

    public void display(){
        this.board.display();
    }
    public void undo(){

    }

    public void makeNextMove(){
        Player player = players.get(turn);
        Move move = player.decideMove(board);
        int row = move.getRow();
        int col = move.getCol();

        Cell cellToMove = board.getCells()[row][col];
        //validate the chosen move
        cellToMove.setPlayer(player);
        moves.add(move);

        GameState gameState = this.gameWinningStrategy.checkForWinner(board, player, cellToMove);
        if(gameState == GameState.End_In_Result){
            this.gameState = GameState.End_In_Result;
            this.winner = player;
        }
        else if(gameState == GameState.End_In_Draw){
            this.gameState = GameState.End_In_Draw;
            this.winner = null;
        }
        else{
            turn = (turn + 1) % players.size();
        }
    }

    public void replay(){

    }
    public static GameBuilder getGameBuilder(){
        return new GameBuilder();
    }



    public static class GameBuilder{
        private int dimensions;
        private List<Player> players;

        public GameBuilder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private void validate() throws InvalidGameArgumentsException {
            //dimensions greater than 3
            if(this.dimensions < 3){
                throw new InvalidGameArgumentsException("Dimensions should be greater than 3");
            }

            HashSet<Character> uniqueSymbols = new HashSet<>();
            for(Player player: players){
                if(uniqueSymbols.contains(player.getSymbol())){
                    throw new InvalidGameArgumentsException("Players should have unique symbol");
                }
                else{
                    uniqueSymbols.add(player.getSymbol());
                }
            }

            // number of players = dimensions - 1
            if(players.size() != dimensions - 1){
                throw new InvalidGameArgumentsException("Number of players should be equal to dimensions - 1");
            }

        }


        public Game build() throws InvalidGameArgumentsException{
            try{
                validate();
                Game game = new Game(dimensions, players);
                return game;
            }
            catch (InvalidGameArgumentsException ex){
                throw ex;
            }
        }

    }


}
