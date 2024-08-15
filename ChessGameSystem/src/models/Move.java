package models;

public class Move {
    private Box startBox;
    private Box endBox;
    private Piece pieceToBeMoved;
    private Piece pieceKilled;
    private Player player;

    public Move(Box start, Box end, Piece pieceToMove, Player player) {
        this.startBox = start;
        this.endBox = end;
        this.pieceToBeMoved = pieceToMove;
        this.player = player;
    }
}
