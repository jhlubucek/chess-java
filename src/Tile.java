public class Tile {
    enum Color{
        white,
        black
    }
    private Coordinate coordinate;
    private Color color;

    public Tile(int x, int y, Color color) {
        this.coordinate = new Coordinate(x,y);
        this.color = color;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Color getColor() {
        return color;
    }
}
