package jigsaw;

public class Edge {

    private Shape shape;
    private String code;// used to mock how pieces 'd fit together
    private Piece parentPiece;

    public Edge(Shape shape, String code) {
        this.shape = shape;
        this.code = code;
    }

    private String getCode() { return code; }

    public Edge createMatchingEdge() {
        if (shape == Shape.FLAT) return null;
        return new Edge(shape.getOpposite, getCode());
    }

    /** @post checks if this edge fits into the other one **/
    public boolean fitsWith(Edge edge) {
        return edge.getCode().equals(getCode());
    }

    /** @post set parent piece **/
    public void setParentPiece(Piece parentPiece) {
        this.parentPiece = parentPiece;
    }

    /** @post get parent piece **/
    public Piece getParentPiece() { return parentPiece; }

    /** @return the shape of the edge **/
    public Shape getShape() { return shape; }

    public String toString() {
        return code;
    }
}
