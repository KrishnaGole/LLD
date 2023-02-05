package TIcTacToe.models;

public class Move {
    private Player player;
    private int row;
    private int col;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    public Move(Player player, int row, int col){
        this.setCol(col);
        this.setRow(row);
        this.setPlayer(player);
    }


}
