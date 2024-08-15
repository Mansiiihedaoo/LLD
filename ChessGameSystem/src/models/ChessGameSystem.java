package models;

import java.util.List;
import java.util.zip.CheckedInputStream;

public class ChessGameSystem {
    private List<ChessGameView> activeGames;
    private List<Player> players;
    private List<Admin> admins;
    private static ChessGameSystem systemInstance = null;
    private ChessGameSystem() {}

    public static ChessGameSystem getInstance() {
        if(systemInstance == null) {
            systemInstance = new ChessGameSystem();
        }
        return systemInstance;
    }

    //methods

    private void createGame() {

    }
    private void JoinGame() {

    }

    //TODO: create more methods that delegate requests to their specific classes
    //TODO: complete the signature for the above 2 methods
}
