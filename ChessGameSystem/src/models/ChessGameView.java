package models;

import constants.GameStatus;

import java.util.List;

public class ChessGameView {
    private Player player1;
    private Player player2;
    private ChessBoard board;
    private boolean currentTurn;
    private GameStatus status;
    private List<Move> movesPlayed;

    public boolean isOver() {
        //dummmy
        return false;
    }

    public boolean createMove(Player player, Box start, Box end) {
        //creation of Move
        //delegating play request to playMove
        //playMove() -> we will not directly call this
        //we will use a command for better encapsulation

        //dummy
//        return true;
        Piece piece = start.getPiece();

        Move newMove = new Move(start,end,piece,player);
        MoveCommand moveCommand = new MoveCommand(this,newMove,player);
        moveCommand.execute();
        //assuming -> everything works correctly
        return true;
    }

    private boolean playMove(Move move, Player player) {
        //validation of Move
        //if valid move, then update the board and proceed
        //stoire the move in movesPlayed

        //dummy
        return true;
    }

    public class MoveCommand implements ChessCommand{

        private ChessGameView game;
        private Move move;
        private Player player;

        public MoveCommand(ChessGameView view, Move move, Player player) {
            this.game = view;
            this.move = move;
            this.player = player;
        }

        @Override
        public void execute() {
            game.playMove(this.move, this.player);
        }
    }




}
