package logic;

public class Game {
    private Board board;

    public Game() {
        this.board = new Board(8, 8);
    }

    public Board getBoard() {
        return board;
    }
}
