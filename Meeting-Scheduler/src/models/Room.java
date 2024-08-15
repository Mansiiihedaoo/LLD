package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Room {

    private String roomId;
    private int capacity;
    private List<Meeting> bookings;

    public Room(int capacity) {
        this.roomId = UUID.randomUUID().toString();
        this.capacity = capacity;
        this.bookings = new ArrayList<>();
    }

    public String getRoomId() {
        return roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailable(LocalDateTime startTime, LocalDateTime endTime) {
        for (Meeting booking : bookings) {
            if (startTime.isBefore(booking.getEndTime()) && endTime.isAfter(booking.getStartTime())) {
                return false;
            }
        }
        return true;
    }

    public void addBooking(Meeting meeting) {
        bookings.add(meeting);
    }

    public void removeBooking(Meeting meeting) {
        bookings.remove(meeting);
    }
}
