package logic;

import logic.pieces.Piece;

public class Tile {

    private Position coordinate;
    private Color color;
    private Piece piece;

    public Tile(int x, int y, Color color) {
        this.coordinate = new Position(x,y);
        this.color = color;
        this.piece = null;
    }

    public Position getCoordinate() {
        return coordinate;
    }

    public Color getColor() {
        return color;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isOccupied(){
        return this.piece != null;
    }

    public String asString(){
//        String result = color == Color.BLACK ? ConsoleColors.WHITE_BACKGROUND +"X"+ConsoleColors.ANSI_RESET : ConsoleColors.BLACK_BACKGROUND_BRIGHT+"A"+ConsoleColors.RESET;
        String result = "";
        if (piece != null) {
            result += piece.getColor() == Color.BLACK ? ConsoleColors.WHITE_BOLD_BRIGHT : ConsoleColors.BLACK_BOLD_BRIGHT;
        }else{
            result += ConsoleColors.BLUE;
        }

        result += color == Color.BLACK ? ConsoleColors.WHITE_BACKGROUND : ConsoleColors.BLACK_BACKGROUND_BRIGHT;
        result+= piece == null ? "X" : piece.getSign();
        result+= ConsoleColors.RESET;

//        result = ConsoleColors.WHITE_BACKGROUND_BRIGHT + ConsoleColors.BLUE_BOLD + "X"+ConsoleColors.ANSI_RESET;
//        result = ConsoleColors.BLACK_BACKGROUND_BRIGHT + ConsoleColors.BLUE_BOLD + "X"+ConsoleColors.ANSI_RESET;
//        result = ConsoleColors.WHITE_BACKGROUND_BRIGHT + ConsoleColors.YELLOW_BOLD_BRIGHT + "X"+ConsoleColors.ANSI_RESET;
        result = ConsoleColors.BLACK_BACKGROUND_BRIGHT + ConsoleColors.YELLOW_BOLD_BRIGHT + "X"+ConsoleColors.ANSI_RESET;
        return result;
    }
}
