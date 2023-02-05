package TIcTacToe.models;

public class Board {
    private Cell[][] cells;

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public Board(int dimensions){
        cells = new Cell[dimensions][dimensions];
        for(int i = 0; i < dimensions; i++){
            for(int j = 0; j < dimensions; j++){
                 cells[i][j] = new Cell(i, j);
            }
        }
    }

    public void display(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells.length; j++){
                Cell currentCell = cells[i][j];
                if(currentCell.getPlayer() == null){
                    System.out.print("|" + "\t" + "|");
                }
                else{
                    System.out.print("|" + currentCell.getPlayer().getSymbol() + "\t" +  "|");
                }
            }
            System.out.println();
        }
    }
}
