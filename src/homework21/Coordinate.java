package homework21;

public class Coordinate<T> {
    private T x;
    private T y;
    public Coordinate(T x, T y) {
        super();
        this.x = x;
        this.y = y;
    }
    public Coordinate() {
        super();
    }

    @Override
    public String toString() {
        return "Coordinate [x=" + x + ", y=" + y + "]";
    }
}
