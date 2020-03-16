package logic.pieces;


import logic.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    private final Color color;
    private Tile tile;

    public Piece(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public Tile getTile() {
        return tile;
    }

    public abstract Character getSign();
    public abstract List<Position> canGoTo();
    public abstract List<Position> canAttack();
}
