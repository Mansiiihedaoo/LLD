package models;

public class Bishop extends Piece{

    @Override
    public boolean canMove(ChessBoard board, Box start, Box end) {
        return false;
    }
}
