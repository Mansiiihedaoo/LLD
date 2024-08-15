package models;

import java.time.LocalDateTime;
import java.util.*;

// RoomManager class (Singleton)
public class RoomManager {
    private static RoomManager instance;
    private List<Room> rooms;

    private RoomManager() {
        this.rooms = new ArrayList<>();
    }

    public static RoomManager getInstance() {
        if (instance == null) {
            instance = new RoomManager();
        }
        return instance;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room findAvailableRoom(int capacity, LocalDateTime startTime, LocalDateTime endTime) {
        for (Room room : rooms) {
            if (room.getCapacity() >= capacity && room.isAvailable(startTime, endTime)) {
                return room;
            }
        }
        return null;
    }
}