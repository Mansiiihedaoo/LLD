package models;

public abstract class Piece {
    private boolean colorOfPiece;
    private boolean pieceKilled;


    public abstract boolean canMove(ChessBoard board, Box start, Box end);
}
