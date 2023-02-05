package TIcTacToe.models;

import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Player(String name, char symbol){
        this.setName(name);
        this.setSymbol(symbol);
    }

    public Move decideMove(Board board){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Tell me the row to move ");
        int row = scanner.nextInt();
        System.out.println(" Tell me the col to move ");
        int col = scanner.nextInt();

        if(row < 0 || row >= board.getCells().length || col < 0 || col >= board.getCells().length){
            System.out.println("The cell is occupied, See the board and chose again");
            board.display();
            return this.decideMove(board);
        }
        else {
            Cell cell = board.getCells()[row][col];
            if (cell.getPlayer() != null) {
                System.out.println("The cell is occupied, See the board and chose again");
                board.display();
                return this.decideMove(board);
            } else {
                return new Move(this, row, col);
            }
        }
    }
}
