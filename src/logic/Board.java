package logic;

import logic.pieces.Piece;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Board {
    private int height;
    private int width;
    private Collection<Piece> pieces;
    private List<List<Tile>> tiles;

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
        pieces = new HashSet<>();
        tiles = new ArrayList<>();
        for(int i=0; i<width; i++) {
            tiles.add(new ArrayList<>());
            for (int z=0; z<height; z++) {
                Tile tile = new Tile(i, z, (i+z)%2 == 0 ? Color.BLACK : Color.WHITE);
//                tile.setPiece(new piece);
                tiles.get(i).add(tile);
            }
        }
    }

    private boolean validPosition(Position position){
        if (position.getX() < width && position.getX()>= 0 && position.getY() < height && position.getY()>= 0){
            return true;
        }else {
            return false;
        }
    };

    private void validatePositions(HashSet<Position> positions){
        positions.removeIf(position -> !this.validPosition(position));
    }

    public List<Move> listPossibleMoves(Color color){
        ArrayList<Move> allMoves = new ArrayList<>();
        //todo
        return allMoves;
    };




    public String toString(){
        String top = "";
        String middle = "";
        String bottom = "";

        top += "┌";
        for (int i = 1; i<(width*2); i++) {
            if(i%2 == 1){
                top += "─";
            }else{
                top += "┬";
            }
        }
        top +="┐";

        middle += "├";
        for (int i = 1; i<(width*2); i++) {
            if(i%2 == 1){
                middle += "─";
            }else{
                middle += "┼";
            }
        }
        middle +="┤";

        bottom += "└";
        for (int i = 1; i<(width*2); i++) {
            if(i%2 == 1){
                bottom += "─";
            }else{
                bottom += "┴";
            }
        }
        bottom +="┘";
        
        StringBuilder result = new StringBuilder();
        result.append(top).append("\n");
        for(int i=0; i<height; i++) {
            for (int z=0; z<width; z++) {
                result.append("│");
                result.append(tiles.get(i).get(z).asString());
            }
            result.append("│\n");
            if (i+1 < height){
                result.append(middle).append("\n");
            }
        }
        result.append(bottom).append("\n");
        return result.toString();
    }
}
